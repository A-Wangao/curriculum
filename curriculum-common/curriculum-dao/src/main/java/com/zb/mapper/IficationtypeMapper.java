package com.zb.mapper;
import com.zb.pojo.Ificationtype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IficationtypeMapper {

	public List<Ificationtype> getIficationtype()throws Exception;

	public Ificationtype getIficationtypeById(@Param(value = "id") int id)throws Exception;

	public List<Ificationtype>	getIficationtypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getIficationtypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertIficationtype(Ificationtype ificationtype)throws Exception;

	public Integer updateIficationtype(Ificationtype ificationtype)throws Exception;


}
