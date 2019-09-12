package com.zb.fallback;

import com.zb.pojo.Comment;

import com.zb.client.RestCommentClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class CommentClientFallBack implements RestCommentClient {


    @Override
    public Comment getCommentById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Comment>	getCommentListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getCommentCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddComment(Comment comment)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyComment(Comment comment)throws Exception{
        return null;
    }
}
