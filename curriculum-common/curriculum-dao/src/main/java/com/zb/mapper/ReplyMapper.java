package com.zb.mapper;
import com.zb.pojo.Reply;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {

	public Reply getReplyById(@Param(value = "id") Long id)throws Exception;

	public List<Reply>	getReplyListByMap(Map<String,Object> param)throws Exception;

	public Integer getReplyCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertReply(Reply reply)throws Exception;

	public Integer updateReply(Reply reply)throws Exception;


}
