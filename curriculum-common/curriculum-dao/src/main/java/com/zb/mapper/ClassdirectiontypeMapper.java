package com.zb.mapper;

import com.zb.pojo.Classdirectiontype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassdirectiontypeMapper {

	public Classdirectiontype getClassdirectiontypeById(@Param(value = "id") Long id)throws Exception;

	public List<Classdirectiontype>	getClassdirectiontypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getClassdirectiontypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertClassdirectiontype(Classdirectiontype classdirectiontype)throws Exception;

	public Integer updateClassdirectiontype(Classdirectiontype classdirectiontype)throws Exception;


}
