package org.spring.springboot.impl;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityDubboService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 城市业务 Dubbo 服务层实现层
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {
	public City findCityByName(String cityName) {
		return new City(1L, 2L, "永州宁远", "是我的故乡");
	}
}
