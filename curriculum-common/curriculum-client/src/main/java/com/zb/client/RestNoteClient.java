package com.zb.client;
import com.zb.pojo.Note;

import com.zb.fallback.NoteClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = NoteClientFallBack.class)
public interface RestNoteClient {

@RequestMapping(value = "/getNote",method = RequestMethod.GET)
public List<Note> getNote()throws Exception;

@RequestMapping(value = "/getNoteById",method = RequestMethod.POST)
public Note getNoteById(@RequestParam("id") int id)throws Exception;

@RequestMapping(value = "/getNoteListByMap",method = RequestMethod.POST)
public List<Note>	getNoteListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getNoteCountByMap",method = RequestMethod.POST)
public Integer getNoteCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddNote",method = RequestMethod.POST)
public Integer qdtxAddNote(@RequestBody Note note)throws Exception;

@RequestMapping(value = "/qdtxModifyNote",method = RequestMethod.POST)
public Integer qdtxModifyNote(@RequestBody Note note)throws Exception;
}

