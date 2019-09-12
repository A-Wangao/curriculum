package com.zb.fallback;

import com.zb.pojo.Classificationtype;

import com.zb.client.RestClassificationtypeClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ClassificationtypeClientFallBack implements RestClassificationtypeClient {


    @Override
    public Classificationtype getClassificationtypeById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Classificationtype>	getClassificationtypeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getClassificationtypeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddClassificationtype(Classificationtype classificationtype)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyClassificationtype(Classificationtype classificationtype)throws Exception{
        return null;
    }
}
