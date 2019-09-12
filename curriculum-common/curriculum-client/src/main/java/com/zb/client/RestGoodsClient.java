package com.zb.client;
import com.zb.pojo.Goods;

import com.zb.fallback.GoodsClientFallBack;
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
@FeignClient(name = "mycloud-order-provider", fallback = GoodsClientFallBack.class)
public interface RestGoodsClient {
@RequestMapping(value = "/getGoodsById",method = RequestMethod.POST)
public Goods getGoodsById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getGoodsListByMap",method = RequestMethod.POST)
public List<Goods>	getGoodsListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getGoodsCountByMap",method = RequestMethod.POST)
public Integer getGoodsCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddGoods",method = RequestMethod.POST)
public Integer qdtxAddGoods(@RequestBody Goods goods)throws Exception;

@RequestMapping(value = "/qdtxModifyGoods",method = RequestMethod.POST)
public Integer qdtxModifyGoods(@RequestBody Goods goods)throws Exception;
}

