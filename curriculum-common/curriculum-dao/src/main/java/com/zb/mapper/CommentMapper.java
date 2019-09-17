package com.zb.mapper;
import com.zb.pojo.Comment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

	public List<Comment> getComment()throws Exception;

	public Comment getCommentById(@Param(value = "id") int id)throws Exception;

	public List<Comment>	getCommentListByMap(Map<String,Object> param)throws Exception;

	public Integer getCommentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertComment(Comment comment)throws Exception;

	public Integer updateComment(Comment comment)throws Exception;


}
