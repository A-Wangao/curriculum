package com.zb.fallback;

import com.zb.pojo.Maincurriculum;

import com.zb.client.RestMaincurriculumClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class MaincurriculumClientFallBack implements RestMaincurriculumClient {

    @Override
    public List<Maincurriculum> getMaincurriculum()throws Exception{
    return null;
    }

    @Override
    public Maincurriculum getMaincurriculumById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Maincurriculum>	getMaincurriculumListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getMaincurriculumCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddMaincurriculum(Maincurriculum maincurriculum)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyMaincurriculum(Maincurriculum maincurriculum)throws Exception{
        return null;
    }
}
