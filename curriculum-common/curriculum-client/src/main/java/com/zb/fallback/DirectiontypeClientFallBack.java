package com.zb.fallback;

import com.zb.pojo.Directiontype;

import com.zb.client.RestDirectiontypeClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DirectiontypeClientFallBack implements RestDirectiontypeClient {

    @Override
    public List<Directiontype> getDirectiontype()throws Exception{
    return null;
    }

    @Override
    public Directiontype getDirectiontypeById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Directiontype>	getDirectiontypeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDirectiontypeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDirectiontype(Directiontype directiontype)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDirectiontype(Directiontype directiontype)throws Exception{
        return null;
    }
}
