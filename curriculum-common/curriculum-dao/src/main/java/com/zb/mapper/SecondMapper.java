package com.zb.mapper;
import com.zb.pojo.Second;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecondMapper {

	public List<Second> getSecond()throws Exception;

	public Second getSecondById(@Param(value = "id") int id)throws Exception;

	public List<Second>	getSecondListByMap(Map<String,Object> param)throws Exception;

	public Integer getSecondCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSecond(Second second)throws Exception;

	public Integer updateSecond(Second second)throws Exception;


}
