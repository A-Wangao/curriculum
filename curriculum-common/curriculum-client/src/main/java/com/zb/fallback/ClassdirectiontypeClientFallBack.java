package com.zb.fallback;

import com.zb.pojo.Classdirectiontype;

import com.zb.client.RestClassdirectiontypeClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ClassdirectiontypeClientFallBack implements RestClassdirectiontypeClient {


    @Override
    public Classdirectiontype getClassdirectiontypeById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Classdirectiontype> getClassdirectiontypeListByMap(Map<String, Object> param) throws Exception {
        return null;
    }

    @Override
    public Integer getClassdirectiontypeCountByMap(Map<String, Object> param) throws Exception {
        return null;
    }

    @Override
    public Integer qdtxAddClassdirectiontype(Classdirectiontype classdirectiontype) throws Exception {
        return null;
    }

    @Override
    public Integer qdtxModifyClassdirectiontype(Classdirectiontype classdirectiontype) throws Exception {
        return null;
    }
}
