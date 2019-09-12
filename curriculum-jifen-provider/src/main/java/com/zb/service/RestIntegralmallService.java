package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.IntegralmallMapper;
import com.zb.pojo.Integralmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dm
 */
@RestController
public class RestIntegralmallService {

    @Autowired(required = false)
    private IntegralmallMapper integralmallMapper;

    @RequestMapping(value = "/getIntegralmallList", method = RequestMethod.GET)
    public List<Integralmall> getIntegralmallList() throws Exception {
        return integralmallMapper.getIntegralmallList();
    }

    @RequestMapping(value = "/getIntegralmallById", method = RequestMethod.POST)
    public Integralmall getIntegralmallById(@RequestParam("id") Long id) throws Exception {
        return integralmallMapper.getIntegralmallById(id);
    }

    @RequestMapping(value = "/getIntegralmallListByMap", method = RequestMethod.POST)
    public List<Integralmall> getIntegralmallListByMap(@RequestParam Map<String, Object> param) throws Exception {
        return integralmallMapper.getIntegralmallListByMap(param);
    }

    @RequestMapping(value = "/getIntegralmallCountByMap", method = RequestMethod.POST)
    public Integer getIntegralmallCountByMap(@RequestParam Map<String, Object> param) throws Exception {
        return integralmallMapper.getIntegralmallCountByMap(param);
    }

    @RequestMapping(value = "/qdtxAddIntegralmall", method = RequestMethod.POST)
    public Integer qdtxAddIntegralmall(@RequestBody Integralmall integralmall) throws Exception {
        integralmall.setTerm(new Date());
        return integralmallMapper.insertIntegralmall(integralmall);
    }

    @RequestMapping(value = "/qdtxModifyIntegralmall", method = RequestMethod.POST)
    public Integer qdtxModifyIntegralmall(@RequestBody Integralmall integralmall) throws Exception {
        integralmall.setTerm(new Date());
        return integralmallMapper.updateIntegralmall(integralmall);
    }
}
