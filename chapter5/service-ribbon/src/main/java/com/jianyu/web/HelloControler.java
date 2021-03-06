package com.jianyu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jianyu.service.HelloService;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return helloService.hiService(name);
    }

}