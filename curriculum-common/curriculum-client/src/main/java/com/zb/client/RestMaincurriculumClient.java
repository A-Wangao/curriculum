package com.zb.client;
import com.zb.pojo.Maincurriculum;

import com.zb.fallback.MaincurriculumClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = MaincurriculumClientFallBack.class)
public interface RestMaincurriculumClient {

@RequestMapping(value = "/getMaincurriculum",method = RequestMethod.GET)
public List<Maincurriculum> getMaincurriculum()throws Exception;

@RequestMapping(value = "/getMaincurriculumById",method = RequestMethod.POST)
public Maincurriculum getMaincurriculumById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getMaincurriculumListByMap",method = RequestMethod.POST)
public List<Maincurriculum>	getMaincurriculumListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getMaincurriculumCountByMap",method = RequestMethod.POST)
public Integer getMaincurriculumCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddMaincurriculum",method = RequestMethod.POST)
public Integer qdtxAddMaincurriculum(@RequestBody Maincurriculum maincurriculum)throws Exception;

@RequestMapping(value = "/qdtxModifyMaincurriculum",method = RequestMethod.POST)
public Integer qdtxModifyMaincurriculum(@RequestBody Maincurriculum maincurriculum)throws Exception;
}

