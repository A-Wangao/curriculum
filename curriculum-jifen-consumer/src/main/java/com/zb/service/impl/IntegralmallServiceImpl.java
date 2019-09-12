package com.zb.service.impl;

import com.zb.client.RestIntegralmallClient;
import com.zb.pojo.Integralmall;
import com.zb.service.IntegralmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntegralmallServiceImpl implements IntegralmallService {
    @Autowired(required = false)
    private RestIntegralmallClient restIntegralmallClient;

    @Override
    public List<Integralmall> getIntegralmallList() throws Exception{
        return restIntegralmallClient.getIntegralmallList();
    }
}
