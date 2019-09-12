package com.zb.client;
import com.zb.pojo.Classificationtype;

import com.zb.fallback.ClassificationtypeClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = ClassificationtypeClientFallBack.class)
public interface RestClassificationtypeClient {
@RequestMapping(value = "/getClassificationtypeById",method = RequestMethod.POST)
public Classificationtype getClassificationtypeById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getClassificationtypeListByMap",method = RequestMethod.POST)
public List<Classificationtype>	getClassificationtypeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getClassificationtypeCountByMap",method = RequestMethod.POST)
public Integer getClassificationtypeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddClassificationtype",method = RequestMethod.POST)
public Integer qdtxAddClassificationtype(@RequestBody Classificationtype classificationtype)throws Exception;

@RequestMapping(value = "/qdtxModifyClassificationtype",method = RequestMethod.POST)
public Integer qdtxModifyClassificationtype(@RequestBody Classificationtype classificationtype)throws Exception;
}

