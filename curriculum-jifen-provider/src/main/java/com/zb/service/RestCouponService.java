package com.zb.service;

import com.zb.pojo.Integralmall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.mapper.CouponMapper;
import com.zb.pojo.Coupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dm
 */
@RestController
public class RestCouponService {

    @Autowired(required = false)
    private CouponMapper couponMapper;

    @RequestMapping(value = "/getCouponById", method = RequestMethod.POST)
    public Coupon getCouponById(@RequestParam("id") Long id) throws Exception {
        return couponMapper.getCouponById(id);
    }

    @RequestMapping(value = "/getCouponListByMap", method = RequestMethod.POST)
    public List<Coupon> getCouponListByMap(@RequestParam Map<String, Object> param) throws Exception {
        return couponMapper.getCouponListByMap(param);
    }

    @RequestMapping(value = "/getCouponCountByMap", method = RequestMethod.POST)
    public Integer getCouponCountByMap(@RequestParam Map<String, Object> param) throws Exception {
        return couponMapper.getCouponCountByMap(param);
    }

    @RequestMapping(value = "/qdtxAddCoupon", method = RequestMethod.POST)
    public Integer qdtxAddCoupon(@RequestBody Coupon coupon) throws Exception {
        coupon.setMaturitytime(new Date());
        return couponMapper.insertCoupon(coupon);
    }

    @RequestMapping(value = "/qdtxModifyCoupon", method = RequestMethod.POST)
    public Integer qdtxModifyCoupon(@RequestBody Coupon coupon) throws Exception {
        coupon.setMaturitytime(new Date());
        return couponMapper.updateCoupon(coupon);
    }
}
