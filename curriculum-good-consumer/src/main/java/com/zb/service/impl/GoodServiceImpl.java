package com.zb.service.impl;

import com.alibaba.fastjson.JSON;
import com.zb.client.RestGoodsClient;
import com.zb.client.RestUsersClient;
import com.zb.dto.Dto;
import com.zb.dto.DtoUtil;
import com.zb.pojo.Goods;
import com.zb.pojo.Users;
import com.zb.service.GoodService;
import com.zb.util.IdWorker;
import com.zb.util.RedisUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired(required = false)
    private RestGoodsClient restGoodsClient;

    @Autowired
    private RestUsersClient restUsersClient;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public Dto getGoodsList() throws Exception {
        List<Goods> list = new ArrayList<>();
        String key = "good";
        if (redisUtils.exist(key)) {
            System.out.println("redis查询缓存");
            String json = redisUtils.get(key).toString();
            list = JSON.parseArray(json, Goods.class);
        } else {
            System.out.println("MySQL查询数据库");
            list = restGoodsClient.getGoodsList();
            String json = JSON.toJSONString(list);
            redisUtils.set(key, json);
        }
        return DtoUtil.returnDataSuccess(list);
    }

    @Override
    public Dto createGood(String token) throws Exception {
//        Users users = restUsersClient.findUserByToken(token);
//        if (users == null)
//            return DtoUtil.returnSuccess("用户不存在！");
        // 用户的抢购商品集合
//        List<Goods> goodsMessageByUser =
//        if (goodsMessageByUser.size() <= 0) {
//            return DtoUtil.returnSuccess("没有您的抢购记录！");
//        }
//        for (QgGoodsMessage goodsMessage : goodsMessageByUser) {
//            String key = "goods_" + goodsMessage.getGoodsId();
//            GoodsVo goodsVo = JSON.parseObject(redisUtils.get(key).toString(), GoodsVo.class);
//            QgOrder qgOrder = new QgOrder();
//            qgOrder.setGoodsId(goodsMessage.getGoodsId());
//            qgOrder.setUserId(goodsMessage.getUserId());
//            qgOrder.setStockId(100 + "");
//            qgOrder.setStatus(0);
//            qgOrder.setNum(1);
//            qgOrder.setAmount(goodsVo.getPrice());
//            qgOrder.setId(IdWorker.getId());
//            rpcOrderService.inserOrder(qgOrder);
//            try {
//                goodsMessage.setStatus(1 + "");
//                goodsMessage.setCreatedTime(null);
//                rpcGoodsService.updateGoodsMessageStatus(goodsMessage);
//            } catch (Exception e) {
//                e.printStackTrace();
//                sendRoll(qgOrder.getId());
        return DtoUtil.returnSuccess("下订单失败！");
//            }
    }


    public void sendRoll(String oid) {
        //发送撤销订单的消息
        System.out.println("发送撤销");
        // 封装消息
        Goods goods = MessageBuilder.withBody(oid.getBytes()).setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setContentEncoding("utf-8").setMessageId(oid).build();
        // 构建回调返回的数据
        CorrelationData correlationData = new CorrelationData(oid);
        this.rabbitTemplate.setMandatory(true);
        this.rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_TOPIC_INFORM, "inform.order", message, correlationData);
    }

    // 生产消息确认机制 生产者往服务器端发送消息的时候 采用应答机制
    int num = 0;

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        String oid = correlationData.getId(); //id 都是相同的
        System.out.println("消息id:" + correlationData.getId());
        if (ack) { //消息发送成功
            System.out.println("消息发送确认成功");
        } else {
            //重试机制
            sendRoll(oid);
            System.out.println("消息发送确认失败:" + cause + "重试次数" + num);
        }
    }


    @RabbitListener(queues = {RabbitConfig.QUEUE_ORDER})
    public void reviceGoodRoll(String param, Message message, Channel channel) throws Exception {
        String messageId = message.getMessageProperties().getMessageId();
        String oid = new String(message.getBody(), "UTF-8");
        System.out.println("删除的订单id：" + oid + ",消息id:" + messageId);

        try {
            int num = rpcOrderService.deleteOrder(oid);

            if (num >= 1) {
                // 手动签收消息,通知mq服务器端删除该消息
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            }
//            throw  new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("丢弃该消息");
            // // 丢弃该消息
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        }
    }

    @RabbitListener(queues = {"shop_pay"})
    public void reviceGoodStatus(Map<String, Object> param, Message message, Channel channel) {
        System.out.println("接收到了pay的订单号:" + param.get("orderNo"));
        Goods goods = new Goods();
        goods.setStatus(1);
        goods.setId(param.get("orderNo").toString());
        rpcOrderService.updateOrderStatus(qgOrder);
        try {
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
