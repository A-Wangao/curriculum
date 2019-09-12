package com.zb.client;
import com.zb.pojo.Curriculum;

import com.zb.fallback.CurriculumClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = CurriculumClientFallBack.class)
public interface RestCurriculumClient {
@RequestMapping(value = "/getCurriculumById",method = RequestMethod.POST)
public Curriculum getCurriculumById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getCurriculumListByMap",method = RequestMethod.POST)
public List<Curriculum>	getCurriculumListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getCurriculumCountByMap",method = RequestMethod.POST)
public Integer getCurriculumCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddCurriculum",method = RequestMethod.POST)
public Integer qdtxAddCurriculum(@RequestBody Curriculum curriculum)throws Exception;

@RequestMapping(value = "/qdtxModifyCurriculum",method = RequestMethod.POST)
public Integer qdtxModifyCurriculum(@RequestBody Curriculum curriculum)throws Exception;
}

