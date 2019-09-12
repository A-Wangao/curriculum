package com.zb.mapper;
import com.zb.pojo.Coupon;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponMapper {

	public Coupon getCouponById(@Param(value = "id") Long id)throws Exception;

	public List<Coupon>	getCouponListByMap(Map<String,Object> param)throws Exception;

	public Integer getCouponCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCoupon(Coupon coupon)throws Exception;

	public Integer updateCoupon(Coupon coupon)throws Exception;


}
