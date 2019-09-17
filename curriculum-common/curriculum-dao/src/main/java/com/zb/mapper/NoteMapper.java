package com.zb.mapper;
import com.zb.pojo.Note;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteMapper {

	public List<Note> getNote()throws Exception;

	public Note getNoteById(@Param(value = "id") int id)throws Exception;

	public List<Note>	getNoteListByMap(Map<String,Object> param)throws Exception;

	public Integer getNoteCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertNote(Note note)throws Exception;

	public Integer updateNote(Note note)throws Exception;


}
