package com.zb.client;
import com.zb.pojo.Chapter;

import com.zb.fallback.ChapterClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = ChapterClientFallBack.class)
public interface RestChapterClient {

@RequestMapping(value = "/getChapter",method = RequestMethod.GET)
public List<Chapter> getChapter()throws Exception;

@RequestMapping(value = "/getChapterById",method = RequestMethod.POST)
public Chapter getChapterById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getChapterListByMap",method = RequestMethod.POST)
public List<Chapter>	getChapterListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getChapterCountByMap",method = RequestMethod.POST)
public Integer getChapterCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddChapter",method = RequestMethod.POST)
public Integer qdtxAddChapter(@RequestBody Chapter chapter)throws Exception;

@RequestMapping(value = "/qdtxModifyChapter",method = RequestMethod.POST)
public Integer qdtxModifyChapter(@RequestBody Chapter chapter)throws Exception;
}

