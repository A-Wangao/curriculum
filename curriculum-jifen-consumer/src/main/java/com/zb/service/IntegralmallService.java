package com.zb.service;

import com.zb.pojo.Integralmall;

import java.util.List;

public interface IntegralmallService {

    public List<Integralmall> getIntegralmallList() throws Exception;

    public Integralmall getIntegralmallByUserId(Long userId) throws  Exception;
}
