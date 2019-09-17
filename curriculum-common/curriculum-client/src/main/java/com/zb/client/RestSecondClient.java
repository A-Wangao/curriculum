package com.zb.client;
import com.zb.pojo.Second;

import com.zb.fallback.SecondClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = SecondClientFallBack.class)
public interface RestSecondClient {

@RequestMapping(value = "/getSecond",method = RequestMethod.GET)
public List<Second> getSecond()throws Exception;

@RequestMapping(value = "/getSecondById",method = RequestMethod.POST)
public Second getSecondById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getSecondListByMap",method = RequestMethod.POST)
public List<Second>	getSecondListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getSecondCountByMap",method = RequestMethod.POST)
public Integer getSecondCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddSecond",method = RequestMethod.POST)
public Integer qdtxAddSecond(@RequestBody Second second)throws Exception;

@RequestMapping(value = "/qdtxModifySecond",method = RequestMethod.POST)
public Integer qdtxModifySecond(@RequestBody Second second)throws Exception;
}

