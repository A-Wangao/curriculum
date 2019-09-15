package com.zb.service.impl;

import com.zb.client.RestIntegralClient;
import com.zb.dto.Dto;
import com.zb.dto.DtoUtil;
import com.zb.pojo.Integral;
import com.zb.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;

public class IntegralServiceImpl implements IntegralService {

    @Autowired(required = false)
    private RestIntegralClient restIntegralClient;
    @Override
    public Dto getIntegralById(Long userId) throws Exception{
        Integral integralByUserId = restIntegralClient.getIntegralByUserId(userId);
        if(integralByUserId==null){
            return DtoUtil.returnSuccess("用户不存在");
        }

        return null;
    }
}
