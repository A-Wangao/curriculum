package com.zb.client;
import com.zb.pojo.Ificationtype;

import com.zb.fallback.IficationtypeClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = IficationtypeClientFallBack.class)
public interface RestIficationtypeClient {

@RequestMapping(value = "/getIficationtype",method = RequestMethod.GET)
public List<Ificationtype> getIficationtype()throws Exception;

@RequestMapping(value = "/getIficationtypeById",method = RequestMethod.POST)
public Ificationtype getIficationtypeById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getIficationtypeListByMap",method = RequestMethod.POST)
public List<Ificationtype>	getIficationtypeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getIficationtypeCountByMap",method = RequestMethod.POST)
public Integer getIficationtypeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddIficationtype",method = RequestMethod.POST)
public Integer qdtxAddIficationtype(@RequestBody Ificationtype ificationtype)throws Exception;

@RequestMapping(value = "/qdtxModifyIficationtype",method = RequestMethod.POST)
public Integer qdtxModifyIficationtype(@RequestBody Ificationtype ificationtype)throws Exception;
}

