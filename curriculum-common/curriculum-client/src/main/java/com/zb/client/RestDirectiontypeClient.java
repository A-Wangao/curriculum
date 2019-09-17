package com.zb.client;
import com.zb.pojo.Directiontype;

import com.zb.fallback.DirectiontypeClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = DirectiontypeClientFallBack.class)
public interface RestDirectiontypeClient {

@RequestMapping(value = "/getDirectiontype",method = RequestMethod.GET)
public List<Directiontype> getDirectiontype()throws Exception;

@RequestMapping(value = "/getDirectiontypeById",method = RequestMethod.POST)
public Directiontype getDirectiontypeById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getDirectiontypeListByMap",method = RequestMethod.POST)
public List<Directiontype>	getDirectiontypeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDirectiontypeCountByMap",method = RequestMethod.POST)
public Integer getDirectiontypeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDirectiontype",method = RequestMethod.POST)
public Integer qdtxAddDirectiontype(@RequestBody Directiontype directiontype)throws Exception;

@RequestMapping(value = "/qdtxModifyDirectiontype",method = RequestMethod.POST)
public Integer qdtxModifyDirectiontype(@RequestBody Directiontype directiontype)throws Exception;
}

