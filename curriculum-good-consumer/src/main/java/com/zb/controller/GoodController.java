package com.zb.controller;

import com.zb.pojo.Goods;
import com.zb.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {

    @Autowired
    private GoodService goodService;

    @RequestMapping(name = "/index",method = RequestMethod.GET)
    public List<Goods> index(){
        try {
            List<Goods> goodsList = goodService.getGoodsList();
            return goodsList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
