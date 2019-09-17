package com.zb.client;
import com.zb.pojo.Coupon;

import com.zb.fallback.CouponClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = CouponClientFallBack.class)
public interface RestCouponClient {

@RequestMapping(value = "/getCoupon",method = RequestMethod.GET)
public List<Coupon> getCoupon()throws Exception;

@RequestMapping(value = "/getCouponById",method = RequestMethod.POST)
public Coupon getCouponById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getCouponListByMap",method = RequestMethod.POST)
public List<Coupon>	getCouponListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getCouponCountByMap",method = RequestMethod.POST)
public Integer getCouponCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddCoupon",method = RequestMethod.POST)
public Integer qdtxAddCoupon(@RequestBody Coupon coupon)throws Exception;

@RequestMapping(value = "/qdtxModifyCoupon",method = RequestMethod.POST)
public Integer qdtxModifyCoupon(@RequestBody Coupon coupon)throws Exception;
}

