package com.zb.mapper;
import com.zb.pojo.Directiontype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DirectiontypeMapper {

	public List<Directiontype> getDirectiontype()throws Exception;

	public Directiontype getDirectiontypeById(@Param(value = "id") int id)throws Exception;

	public List<Directiontype>	getDirectiontypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getDirectiontypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDirectiontype(Directiontype directiontype)throws Exception;

	public Integer updateDirectiontype(Directiontype directiontype)throws Exception;


}
