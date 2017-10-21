package com.jianyu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jianyu.service.SchedualServiceHello;

@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello schedualServiceHello;
    
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHello.sayHiFromClientOne(name);
    }
}
