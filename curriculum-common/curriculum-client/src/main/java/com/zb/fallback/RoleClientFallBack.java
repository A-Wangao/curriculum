package com.zb.fallback;

import com.zb.pojo.Role;

import com.zb.client.RestRoleClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class RoleClientFallBack implements RestRoleClient {

    @Override
    public List<Role> getRole()throws Exception{
    return null;
    }

    @Override
    public Role getRoleById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Role>	getRoleListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getRoleCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddRole(Role role)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyRole(Role role)throws Exception{
        return null;
    }
}
