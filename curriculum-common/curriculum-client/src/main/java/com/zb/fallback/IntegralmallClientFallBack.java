package com.zb.fallback;

import com.zb.pojo.Integralmall;

import com.zb.client.RestIntegralmallClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class IntegralmallClientFallBack implements RestIntegralmallClient {

    @Override
    public List<Integralmall> getIntegralmall()throws Exception{
    return null;
    }

    @Override
    public Integralmall getIntegralmallById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Integralmall>	getIntegralmallListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getIntegralmallCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddIntegralmall(Integralmall integralmall)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyIntegralmall(Integralmall integralmall)throws Exception{
        return null;
    }
}
