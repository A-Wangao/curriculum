package com.zb.fallback;

import com.zb.pojo.Administrator;

import com.zb.client.RestAdministratorClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class AdministratorClientFallBack implements RestAdministratorClient {

    @Override
    public List<Administrator> getAdministrator()throws Exception{
    return null;
    }

    @Override
    public Administrator getAdministratorById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Administrator>	getAdministratorListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getAdministratorCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddAdministrator(Administrator administrator)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyAdministrator(Administrator administrator)throws Exception{
        return null;
    }
}
