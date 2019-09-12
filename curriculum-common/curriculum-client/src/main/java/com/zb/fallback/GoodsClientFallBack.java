package com.zb.fallback;

import com.zb.pojo.Goods;

import com.zb.client.RestGoodsClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class GoodsClientFallBack implements RestGoodsClient {


    @Override
    public Goods getGoodsById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Goods>	getGoodsListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getGoodsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddGoods(Goods goods)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyGoods(Goods goods)throws Exception{
        return null;
    }
}
