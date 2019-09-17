package com.zb.client;
import com.zb.pojo.Administrator;

import com.zb.fallback.AdministratorClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = AdministratorClientFallBack.class)
public interface RestAdministratorClient {

@RequestMapping(value = "/getAdministrator",method = RequestMethod.GET)
public List<Administrator> getAdministrator()throws Exception;

@RequestMapping(value = "/getAdministratorById",method = RequestMethod.POST)
public Administrator getAdministratorById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getAdministratorListByMap",method = RequestMethod.POST)
public List<Administrator>	getAdministratorListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getAdministratorCountByMap",method = RequestMethod.POST)
public Integer getAdministratorCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddAdministrator",method = RequestMethod.POST)
public Integer qdtxAddAdministrator(@RequestBody Administrator administrator)throws Exception;

@RequestMapping(value = "/qdtxModifyAdministrator",method = RequestMethod.POST)
public Integer qdtxModifyAdministrator(@RequestBody Administrator administrator)throws Exception;
}

