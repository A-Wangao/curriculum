package com.zb.fallback;

import com.zb.pojo.Teacherapply;

import com.zb.client.RestTeacherapplyClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class TeacherapplyClientFallBack implements RestTeacherapplyClient {

    @Override
    public List<Teacherapply> getTeacherapply()throws Exception{
    return null;
    }

    @Override
    public Teacherapply getTeacherapplyById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Teacherapply>	getTeacherapplyListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getTeacherapplyCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddTeacherapply(Teacherapply teacherapply)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyTeacherapply(Teacherapply teacherapply)throws Exception{
        return null;
    }
}
