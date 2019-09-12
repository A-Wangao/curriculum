package com.zb.mapper;
import com.zb.pojo.Classificationtype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassificationtypeMapper {

	public Classificationtype getClassificationtypeById(@Param(value = "id") Long id)throws Exception;

	public List<Classificationtype>	getClassificationtypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getClassificationtypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertClassificationtype(Classificationtype classificationtype)throws Exception;

	public Integer updateClassificationtype(Classificationtype classificationtype)throws Exception;


}
