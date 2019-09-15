package com.zb.mapper;
import com.zb.pojo.Integral;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IntegralMapper {

	public Integral getIntegralByUserId(@Param(value = "UserId") Long UserId)throws Exception;

	public List<Integral>	getIntegralListByMap(Map<String,Object> param)throws Exception;

	public Integer getIntegralCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertIntegral(Integral integral)throws Exception;

	public Integer updateIntegral(Integral integral)throws Exception;


}
