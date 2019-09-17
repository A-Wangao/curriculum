package com.zb.fallback;

import com.zb.pojo.Usercurriculum;

import com.zb.client.RestUsercurriculumClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class UsercurriculumClientFallBack implements RestUsercurriculumClient {

    @Override
    public List<Usercurriculum> getUsercurriculum()throws Exception{
    return null;
    }

    @Override
    public Usercurriculum getUsercurriculumById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Usercurriculum>	getUsercurriculumListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getUsercurriculumCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddUsercurriculum(Usercurriculum usercurriculum)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyUsercurriculum(Usercurriculum usercurriculum)throws Exception{
        return null;
    }
}
