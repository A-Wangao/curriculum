package com.zb.client;
import com.zb.pojo.Userrole;

import com.zb.fallback.UserroleClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = UserroleClientFallBack.class)
public interface RestUserroleClient {

@RequestMapping(value = "/getUserrole",method = RequestMethod.GET)
public List<Userrole> getUserrole()throws Exception;

@RequestMapping(value = "/getUserroleById",method = RequestMethod.POST)
public Userrole getUserroleById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getUserroleListByMap",method = RequestMethod.POST)
public List<Userrole>	getUserroleListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getUserroleCountByMap",method = RequestMethod.POST)
public Integer getUserroleCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddUserrole",method = RequestMethod.POST)
public Integer qdtxAddUserrole(@RequestBody Userrole userrole)throws Exception;

@RequestMapping(value = "/qdtxModifyUserrole",method = RequestMethod.POST)
public Integer qdtxModifyUserrole(@RequestBody Userrole userrole)throws Exception;
}

