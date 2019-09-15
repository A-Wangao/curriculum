package com.zb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.IntegralMapper;
import com.zb.pojo.Integral;

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
public class RestIntegralService {

    @Autowired(required = false)
    private IntegralMapper integralMapper;

    @RequestMapping(value = "/getIntegralById", method = RequestMethod.POST)
    public Integral getIntegralById(@RequestParam("userId") Long userId) throws Exception {
        return integralMapper.getIntegralByUserId(userId);
    }

    @RequestMapping(value = "/getIntegralListByMap", method = RequestMethod.POST)
    public List<Integral> getIntegralListByMap(@RequestParam Map<String, Object> param) throws Exception {
        return integralMapper.getIntegralListByMap(param);
    }

    @RequestMapping(value = "/getIntegralCountByMap", method = RequestMethod.POST)
    public Integer getIntegralCountByMap(@RequestParam Map<String, Object> param) throws Exception {
        return integralMapper.getIntegralCountByMap(param);
    }

    @RequestMapping(value = "/qdtxAddIntegral", method = RequestMethod.POST)
    public Integer qdtxAddIntegral(@RequestBody Integral integral) throws Exception {
        integral.setGetdate(new Date());
        return integralMapper.insertIntegral(integral);
    }

    @RequestMapping(value = "/qdtxModifyIntegral", method = RequestMethod.POST)
    public Integer qdtxModifyIntegral(@RequestBody Integral integral) throws Exception {
        integral.setGetdate(new Date());
        return integralMapper.updateIntegral(integral);
    }
}
