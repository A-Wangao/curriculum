package com.zb.client;

import com.zb.pojo.Expenditure;

import com.zb.fallback.ExpenditureClientFallBack;

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
@FeignClient(name = "mycloud-order-provider", fallback = ExpenditureClientFallBack.class)
public interface RestExpenditureClient {
    @RequestMapping(value = "/getExpenditureById", method = RequestMethod.POST)
    public Expenditure getExpenditureById(@RequestParam("id") Long id) throws Exception;

    @RequestMapping(value = "/getExpenditureListByMap", method = RequestMethod.POST)
    public List<Expenditure> getExpenditureListByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/getExpenditureCountByMap", method = RequestMethod.POST)
    public Integer getExpenditureCountByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/qdtxAddExpenditure", method = RequestMethod.POST)
    public Integer qdtxAddExpenditure(@RequestBody Expenditure expenditure) throws Exception;

    @RequestMapping(value = "/qdtxModifyExpenditure", method = RequestMethod.POST)
    public Integer qdtxModifyExpenditure(@RequestBody Expenditure expenditure) throws Exception;
}

