package com.zb.client;
import com.zb.pojo.Integralmall;

import com.zb.fallback.IntegralmallClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = IntegralmallClientFallBack.class)
public interface RestIntegralmallClient {

@RequestMapping(value = "/getIntegralmall",method = RequestMethod.GET)
public List<Integralmall> getIntegralmall()throws Exception;

@RequestMapping(value = "/getIntegralmallById",method = RequestMethod.POST)
public Integralmall getIntegralmallById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getIntegralmallListByMap",method = RequestMethod.POST)
public List<Integralmall>	getIntegralmallListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getIntegralmallCountByMap",method = RequestMethod.POST)
public Integer getIntegralmallCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddIntegralmall",method = RequestMethod.POST)
public Integer qdtxAddIntegralmall(@RequestBody Integralmall integralmall)throws Exception;

@RequestMapping(value = "/qdtxModifyIntegralmall",method = RequestMethod.POST)
public Integer qdtxModifyIntegralmall(@RequestBody Integralmall integralmall)throws Exception;
}

