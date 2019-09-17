package com.zb.controller;

import com.zb.dto.Dto;
import com.zb.dto.DtoUtil;
import com.zb.pojo.Integral;
import com.zb.pojo.Integralmall;
import com.zb.service.IntegralService;
import com.zb.service.IntegralmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IntegralmallController {

    @Autowired(required = false)
    private IntegralmallService integralmallService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public List<Integralmall> index(){
        try {
            List<Integralmall> integralmallList = integralmallService.getIntegralmallList();
            for (Integralmall integralmall : integralmallList) {
                System.out.println(integralmall.getTerm());
            }
            return integralmallList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public int add(Integralmall integralmall){
        try {
            int i = integralmallService.addIntegralmall(integralmall);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
