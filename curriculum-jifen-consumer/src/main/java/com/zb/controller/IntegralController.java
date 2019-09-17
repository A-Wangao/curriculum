package com.zb.controller;

import com.zb.pojo.Integral;
import com.zb.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IntegralController {

    @Autowired(required = false)
    private IntegralService integralService;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public Integral show(@RequestBody int id){
        try {
            Integral integralById = integralService.getIntegralById(id);
            System.out.println(integralById.getId());
            return integralById;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
