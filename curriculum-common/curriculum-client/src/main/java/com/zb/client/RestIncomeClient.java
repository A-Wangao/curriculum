package com.zb.client;

import com.zb.pojo.Income;

import com.zb.fallback.IncomeClientFallBack;

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
@FeignClient(name = "mycloud-order-provider", fallback = IncomeClientFallBack.class)
public interface RestIncomeClient {
    @RequestMapping(value = "/getIncomeById", method = RequestMethod.POST)
    public Income getIncomeById(@RequestParam("id") Long id) throws Exception;

    @RequestMapping(value = "/getIncomeListByMap", method = RequestMethod.POST)
    public List<Income> getIncomeListByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/getIncomeCountByMap", method = RequestMethod.POST)
    public Integer getIncomeCountByMap(@RequestParam Map<String, Object> param) throws Exception;

    @RequestMapping(value = "/qdtxAddIncome", method = RequestMethod.POST)
    public Integer qdtxAddIncome(@RequestBody Income income) throws Exception;

    @RequestMapping(value = "/qdtxModifyIncome", method = RequestMethod.POST)
    public Integer qdtxModifyIncome(@RequestBody Income income) throws Exception;
}

