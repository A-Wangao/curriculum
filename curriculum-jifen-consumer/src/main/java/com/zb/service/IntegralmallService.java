package com.zb.service;

import com.zb.pojo.Integralmall;

import java.util.List;

public interface IntegralmallService {

    public List<Integralmall> getIntegralmallList() throws Exception;

    public int addIntegralmall(Integralmall integralmall)throws Exception;

}
