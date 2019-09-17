package com.zb.mapper;
import com.zb.pojo.Maincurriculum;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MaincurriculumMapper {

	public List<Maincurriculum> getMaincurriculum()throws Exception;

	public Maincurriculum getMaincurriculumById(@Param(value = "id") int id)throws Exception;

	public List<Maincurriculum>	getMaincurriculumListByMap(Map<String,Object> param)throws Exception;

	public Integer getMaincurriculumCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertMaincurriculum(Maincurriculum maincurriculum)throws Exception;

	public Integer updateMaincurriculum(Maincurriculum maincurriculum)throws Exception;


}
