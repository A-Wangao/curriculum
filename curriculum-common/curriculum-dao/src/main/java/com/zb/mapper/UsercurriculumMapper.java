package com.zb.mapper;
import com.zb.pojo.Usercurriculum;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsercurriculumMapper {

	public List<Usercurriculum> getUsercurriculum()throws Exception;

	public Usercurriculum getUsercurriculumById(@Param(value = "id") int id)throws Exception;

	public List<Usercurriculum>	getUsercurriculumListByMap(Map<String,Object> param)throws Exception;

	public Integer getUsercurriculumCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertUsercurriculum(Usercurriculum usercurriculum)throws Exception;

	public Integer updateUsercurriculum(Usercurriculum usercurriculum)throws Exception;


}
