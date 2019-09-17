package com.zb.fallback;

import com.zb.pojo.Userrole;

import com.zb.client.RestUserroleClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class UserroleClientFallBack implements RestUserroleClient {

    @Override
    public List<Userrole> getUserrole()throws Exception{
    return null;
    }

    @Override
    public Userrole getUserroleById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Userrole>	getUserroleListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getUserroleCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddUserrole(Userrole userrole)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyUserrole(Userrole userrole)throws Exception{
        return null;
    }
}
