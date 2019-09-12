package com.zb.client;
import com.zb.pojo.Classdirectiontype;

import com.zb.fallback.ClassdirectiontypeClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = ClassdirectiontypeClientFallBack.class)
public interface RestClassdirectiontypeClient {
@RequestMapping(value = "/getClassdirectiontypeById",method = RequestMethod.POST)
public Classdirectiontype getClassdirectiontypeById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getClassdirectiontypeListByMap",method = RequestMethod.POST)
public List<Classdirectiontype>	getClassdirectiontypeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getClassdirectiontypeCountByMap",method = RequestMethod.POST)
public Integer getClassdirectiontypeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddClassdirectiontype",method = RequestMethod.POST)
public Integer qdtxAddClassdirectiontype(@RequestBody Classdirectiontype classdirectiontype)throws Exception;

@RequestMapping(value = "/qdtxModifyClassdirectiontype",method = RequestMethod.POST)
public Integer qdtxModifyClassdirectiontype(@RequestBody Classdirectiontype classdirectiontype)throws Exception;
}

