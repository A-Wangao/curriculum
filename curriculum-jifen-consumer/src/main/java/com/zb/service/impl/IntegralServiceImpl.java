package com.zb.service.impl;

import com.zb.client.RestIntegralClient;
import com.zb.pojo.Integral;
import com.zb.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegralServiceImpl implements IntegralService {

    @Autowired(required = false)
    private RestIntegralClient restIntegralClient;
    @Override
    public Integral getIntegralById(int Id) throws Exception{
        return restIntegralClient.getIntegralById(Id);
    }
}
