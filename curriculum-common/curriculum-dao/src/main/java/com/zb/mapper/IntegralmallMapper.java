package com.zb.mapper;
import com.zb.pojo.Integralmall;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IntegralmallMapper {

	public List<Integralmall> getIntegralmallList() throws Exception;

	public Integralmall getIntegralmallById(@Param(value = "id") Long id)throws Exception;

	public List<Integralmall>	getIntegralmallListByMap(Map<String,Object> param)throws Exception;

	public Integer getIntegralmallCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertIntegralmall(Integralmall integralmall)throws Exception;

	public Integer updateIntegralmall(Integralmall integralmall)throws Exception;


}
