package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.GoodsMapper;
import com.zb.pojo.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dm
 */
@RestController
public class RestGoodsService {

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    @RequestMapping(value = "/getGoodsById", method = RequestMethod.POST)
    public Goods getGoodsById(@RequestParam("id") Long id) throws Exception {
        return goodsMapper.getGoodsById(id);
    }

    @RequestMapping(value = "/getGoodsListByMap", method = RequestMethod.POST)
    public List<Goods> getGoodsListByMap(@RequestParam Map<String, Object> param) throws Exception {
        return goodsMapper.getGoodsListByMap(param);
    }

    @RequestMapping(value = "/getGoodsCountByMap", method = RequestMethod.POST)
    public Integer getGoodsCountByMap(@RequestParam Map<String, Object> param) throws Exception {
        return goodsMapper.getGoodsCountByMap(param);
    }

    @RequestMapping(value = "/qdtxAddGoods", method = RequestMethod.POST)
    public Integer qdtxAddGoods(@RequestBody Goods goods) throws Exception {
        goods.setCreatetime(new Date());
        return goodsMapper.insertGoods(goods);
    }

    @RequestMapping(value = "/qdtxModifyGoods", method = RequestMethod.POST)
    public Integer qdtxModifyGoods(@RequestBody Goods goods) throws Exception {
        goods.setCreatetime(new Date());
        return goodsMapper.updateGoods(goods);
    }
}
