package com.jianyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "helloError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-MY/hello?name=" + name, String.class);
	}
	
	public String helloError(String name) {
        return "Sorry, "+name+", error happens! ";
    }
}