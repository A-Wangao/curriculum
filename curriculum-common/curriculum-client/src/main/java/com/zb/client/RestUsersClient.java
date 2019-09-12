package com.zb.client;
import com.zb.pojo.Users;

import com.zb.fallback.UsersClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = UsersClientFallBack.class)
public interface RestUsersClient {
@RequestMapping(value = "/getUsersById",method = RequestMethod.POST)
public Users getUsersById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getUsersListByMap",method = RequestMethod.POST)
public List<Users>	getUsersListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getUsersCountByMap",method = RequestMethod.POST)
public Integer getUsersCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddUsers",method = RequestMethod.POST)
public Integer qdtxAddUsers(@RequestBody Users users)throws Exception;

@RequestMapping(value = "/qdtxModifyUsers",method = RequestMethod.POST)
public Integer qdtxModifyUsers(@RequestBody Users users)throws Exception;
}

