package com.zb.service.impl;

import com.alibaba.fastjson.JSON;
import com.zb.client.RestIntegralmallClient;
import com.zb.dto.DtoUtil;
import com.zb.pojo.Integralmall;
import com.zb.service.IntegralmallService;
import com.zb.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class IntegralmallServiceImpl implements IntegralmallService {

    @Autowired(required = false)
    private RestIntegralmallClient restIntegralmallClient;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public List<Integralmall> getIntegralmallList() throws Exception{
        List<Integralmall> list=new ArrayList<>();
        String key="jifen";
        if(redisUtils.exist(key)){
            System.out.println("redis查询缓存");
            String json=redisUtils.get(key).toString();
            list= JSON.parseArray(json, Integralmall.class);
        }else {
            System.out.println("MySQL查询数据库");
            list=restIntegralmallClient.getIntegralmallList();
            String json=JSON.toJSONString(list);
            redisUtils.set(key, json);
        }
        return list;
    }

    @Override
    public Integralmall getIntegralmallByUserId(Long userId) throws Exception {
        return null;
    }
}
