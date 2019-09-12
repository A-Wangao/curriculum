package com.zb.client;
import com.zb.pojo.Reply;

import com.zb.fallback.ReplyClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "mycloud-order-provider", fallback = ReplyClientFallBack.class)
public interface RestReplyClient {
@RequestMapping(value = "/getReplyById",method = RequestMethod.POST)
public Reply getReplyById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getReplyListByMap",method = RequestMethod.POST)
public List<Reply>	getReplyListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getReplyCountByMap",method = RequestMethod.POST)
public Integer getReplyCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddReply",method = RequestMethod.POST)
public Integer qdtxAddReply(@RequestBody Reply reply)throws Exception;

@RequestMapping(value = "/qdtxModifyReply",method = RequestMethod.POST)
public Integer qdtxModifyReply(@RequestBody Reply reply)throws Exception;
}

