package com.zb.fallback;

import com.zb.pojo.Users;

import com.zb.client.RestUsersClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class UsersClientFallBack implements RestUsersClient {


    @Override
    public Users getUsersById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Users>	getUsersListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getUsersCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddUsers(Users users)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyUsers(Users users)throws Exception{
        return null;
    }
}
