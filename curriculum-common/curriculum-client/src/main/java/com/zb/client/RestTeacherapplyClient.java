package com.zb.client;
import com.zb.pojo.Teacherapply;

import com.zb.fallback.TeacherapplyClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = TeacherapplyClientFallBack.class)
public interface RestTeacherapplyClient {

@RequestMapping(value = "/getTeacherapply",method = RequestMethod.GET)
public List<Teacherapply> getTeacherapply()throws Exception;

@RequestMapping(value = "/getTeacherapplyById",method = RequestMethod.POST)
public Teacherapply getTeacherapplyById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getTeacherapplyListByMap",method = RequestMethod.POST)
public List<Teacherapply>	getTeacherapplyListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getTeacherapplyCountByMap",method = RequestMethod.POST)
public Integer getTeacherapplyCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddTeacherapply",method = RequestMethod.POST)
public Integer qdtxAddTeacherapply(@RequestBody Teacherapply teacherapply)throws Exception;

@RequestMapping(value = "/qdtxModifyTeacherapply",method = RequestMethod.POST)
public Integer qdtxModifyTeacherapply(@RequestBody Teacherapply teacherapply)throws Exception;
}

