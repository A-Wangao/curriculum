package com.zb.fallback;

import com.zb.pojo.Second;

import com.zb.client.RestSecondClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class SecondClientFallBack implements RestSecondClient {

    @Override
    public List<Second> getSecond()throws Exception{
    return null;
    }

    @Override
    public Second getSecondById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Second>	getSecondListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getSecondCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddSecond(Second second)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifySecond(Second second)throws Exception{
        return null;
    }
}
