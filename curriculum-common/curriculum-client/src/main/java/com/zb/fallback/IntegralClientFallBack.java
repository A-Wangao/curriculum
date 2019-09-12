package com.zb.fallback;

import com.zb.pojo.Integral;

import com.zb.client.RestIntegralClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class IntegralClientFallBack implements RestIntegralClient {


    @Override
    public Integral getIntegralById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Integral>	getIntegralListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getIntegralCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddIntegral(Integral integral)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyIntegral(Integral integral)throws Exception{
        return null;
    }
}
