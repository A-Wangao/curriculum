package com.zb.fallback;

import com.zb.pojo.Income;

import com.zb.client.RestIncomeClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class IncomeClientFallBack implements RestIncomeClient {

    @Override
    public List<Income> getIncome()throws Exception{
    return null;
    }

    @Override
    public Income getIncomeById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Income>	getIncomeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getIncomeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddIncome(Income income)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyIncome(Income income)throws Exception{
        return null;
    }
}
