package com.zb.mapper;
import com.zb.pojo.Teacherapply;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherapplyMapper {

	public List<Teacherapply> getTeacherapply()throws Exception;

	public Teacherapply getTeacherapplyById(@Param(value = "id") int id)throws Exception;

	public List<Teacherapply>	getTeacherapplyListByMap(Map<String,Object> param)throws Exception;

	public Integer getTeacherapplyCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTeacherapply(Teacherapply teacherapply)throws Exception;

	public Integer updateTeacherapply(Teacherapply teacherapply)throws Exception;


}
