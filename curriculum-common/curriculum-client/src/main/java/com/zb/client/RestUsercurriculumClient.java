package com.zb.client;
import com.zb.pojo.Usercurriculum;

import com.zb.fallback.UsercurriculumClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = UsercurriculumClientFallBack.class)
public interface RestUsercurriculumClient {

@RequestMapping(value = "/getUsercurriculum",method = RequestMethod.GET)
public List<Usercurriculum> getUsercurriculum()throws Exception;

@RequestMapping(value = "/getUsercurriculumById",method = RequestMethod.POST)
public Usercurriculum getUsercurriculumById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getUsercurriculumListByMap",method = RequestMethod.POST)
public List<Usercurriculum>	getUsercurriculumListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getUsercurriculumCountByMap",method = RequestMethod.POST)
public Integer getUsercurriculumCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddUsercurriculum",method = RequestMethod.POST)
public Integer qdtxAddUsercurriculum(@RequestBody Usercurriculum usercurriculum)throws Exception;

@RequestMapping(value = "/qdtxModifyUsercurriculum",method = RequestMethod.POST)
public Integer qdtxModifyUsercurriculum(@RequestBody Usercurriculum usercurriculum)throws Exception;
}

