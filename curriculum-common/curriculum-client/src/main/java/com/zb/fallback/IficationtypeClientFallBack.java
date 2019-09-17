package com.zb.fallback;

import com.zb.pojo.Ificationtype;

import com.zb.client.RestIficationtypeClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class IficationtypeClientFallBack implements RestIficationtypeClient {

    @Override
    public List<Ificationtype> getIficationtype()throws Exception{
    return null;
    }

    @Override
    public Ificationtype getIficationtypeById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Ificationtype>	getIficationtypeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getIficationtypeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddIficationtype(Ificationtype ificationtype)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyIficationtype(Ificationtype ificationtype)throws Exception{
        return null;
    }
}
