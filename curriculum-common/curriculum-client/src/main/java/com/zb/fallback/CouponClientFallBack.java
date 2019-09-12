package com.zb.fallback;

import com.zb.pojo.Coupon;

import com.zb.client.RestCouponClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class CouponClientFallBack implements RestCouponClient {


    @Override
    public Coupon getCouponById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Coupon>	getCouponListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getCouponCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddCoupon(Coupon coupon)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyCoupon(Coupon coupon)throws Exception{
        return null;
    }
}
