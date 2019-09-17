package com.zb.client;
import com.zb.pojo.Integral;

import com.zb.fallback.IntegralClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "mycloud-order-provider", fallback = IntegralClientFallBack.class)
public interface RestIntegralClient {

@RequestMapping(value = "/getIntegral",method = RequestMethod.GET)
public List<Integral> getIntegral()throws Exception;

@RequestMapping(value = "/getIntegralById",method = RequestMethod.POST)
public Integral getIntegralById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getIntegralListByMap",method = RequestMethod.POST)
public List<Integral>	getIntegralListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getIntegralCountByMap",method = RequestMethod.POST)
public Integer getIntegralCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddIntegral",method = RequestMethod.POST)
public Integer qdtxAddIntegral(@RequestBody Integral integral)throws Exception;

@RequestMapping(value = "/qdtxModifyIntegral",method = RequestMethod.POST)
public Integer qdtxModifyIntegral(@RequestBody Integral integral)throws Exception;
}

