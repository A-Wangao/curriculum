package com.zb.fallback;

import com.zb.pojo.Reply;

import com.zb.client.RestReplyClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ReplyClientFallBack implements RestReplyClient {


    @Override
    public Reply getReplyById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Reply>	getReplyListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getReplyCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddReply(Reply reply)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyReply(Reply reply)throws Exception{
        return null;
    }
}
