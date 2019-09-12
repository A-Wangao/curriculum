package com.zb.fallback;

import com.zb.pojo.Curriculum;

import com.zb.client.RestCurriculumClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class CurriculumClientFallBack implements RestCurriculumClient {


    @Override
    public Curriculum getCurriculumById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Curriculum>	getCurriculumListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getCurriculumCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddCurriculum(Curriculum curriculum)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyCurriculum(Curriculum curriculum)throws Exception{
        return null;
    }
}
