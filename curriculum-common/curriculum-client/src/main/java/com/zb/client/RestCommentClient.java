package com.zb.client;

import com.zb.pojo.Comment;

import com.zb.fallback.CommentClientFallBack;

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
@FeignClient(name = "mycloud-order-provider", fallback = CommentClientFallBack.class)
public interface RestCommentClient {
    @RequestMapping(value = "/getCommentById", method = RequestMethod.POST)
    public Comment getCommentById(@RequestParam("id") Long id) throws Exception;

    @RequestMapping(value = "/getCommentListByMap", method = RequestMethod.POST)
    public List<Comment> getCommentListByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/getCommentCountByMap", method = RequestMethod.POST)
    public Integer getCommentCountByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/qdtxAddComment", method = RequestMethod.POST)
    public Integer qdtxAddComment(@RequestBody Comment comment) throws Exception;

    @RequestMapping(value = "/qdtxModifyComment", method = RequestMethod.POST)
    public Integer qdtxModifyComment(@RequestBody Comment comment) throws Exception;
}

