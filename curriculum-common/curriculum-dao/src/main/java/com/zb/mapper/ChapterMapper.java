package com.zb.mapper;
import com.zb.pojo.Chapter;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChapterMapper {

	public List<Chapter> getChapter()throws Exception;

	public Chapter getChapterById(@Param(value = "id") int id)throws Exception;

	public List<Chapter>	getChapterListByMap(Map<String,Object> param)throws Exception;

	public Integer getChapterCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertChapter(Chapter chapter)throws Exception;

	public Integer updateChapter(Chapter chapter)throws Exception;


}
