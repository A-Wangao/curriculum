package com.zb.client;
import com.zb.pojo.Role;

import com.zb.fallback.RoleClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = RoleClientFallBack.class)
public interface RestRoleClient {

@RequestMapping(value = "/getRole",method = RequestMethod.GET)
public List<Role> getRole()throws Exception;

@RequestMapping(value = "/getRoleById",method = RequestMethod.POST)
public Role getRoleById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getRoleListByMap",method = RequestMethod.POST)
public List<Role>	getRoleListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getRoleCountByMap",method = RequestMethod.POST)
public Integer getRoleCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddRole",method = RequestMethod.POST)
public Integer qdtxAddRole(@RequestBody Role role)throws Exception;

@RequestMapping(value = "/qdtxModifyRole",method = RequestMethod.POST)
public Integer qdtxModifyRole(@RequestBody Role role)throws Exception;
}

