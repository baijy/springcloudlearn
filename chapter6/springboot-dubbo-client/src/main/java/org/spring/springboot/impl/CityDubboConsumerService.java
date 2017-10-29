package org.spring.springboot.impl;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityDubboService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 城市 Dubbo 服务消费者
 */
@Component
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="永州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
