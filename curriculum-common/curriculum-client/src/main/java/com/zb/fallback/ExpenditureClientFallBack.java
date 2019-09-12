package com.zb.fallback;

import com.zb.pojo.Expenditure;

import com.zb.client.RestExpenditureClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ExpenditureClientFallBack implements RestExpenditureClient {


    @Override
    public Expenditure getExpenditureById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Expenditure>	getExpenditureListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getExpenditureCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddExpenditure(Expenditure expenditure)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyExpenditure(Expenditure expenditure)throws Exception{
        return null;
    }
}
