package com.jianyu.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {

	@Override
	public String sayHiFromClientOne(String name) {
		return "Sorry, "+name+",error happens! ";
	}

}
