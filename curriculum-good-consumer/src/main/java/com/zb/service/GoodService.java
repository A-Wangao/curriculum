package com.zb.service;

import com.zb.dto.Dto;
import com.zb.pojo.Goods;
import org.springframework.amqp.rabbit.support.CorrelationData;

import java.util.List;

public interface GoodService {
    public Dto getGoodsList() throws Exception;

    public Dto createGood(String token) throws Exception;

    public void confirm(CorrelationData correlationData, boolean ack, String cause)throws Exception;
}
