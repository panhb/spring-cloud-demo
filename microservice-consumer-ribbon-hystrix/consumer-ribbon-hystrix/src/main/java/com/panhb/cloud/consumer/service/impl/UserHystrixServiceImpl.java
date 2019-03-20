package com.panhb.cloud.consumer.service.impl;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.panhb.cloud.consumer.entity.User;
import com.panhb.cloud.consumer.service.UserHystrixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


@Service
public class UserHystrixServiceImpl implements UserHystrixService {

	private static final Logger log = LoggerFactory.getLogger(UserHystrixServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback")
	@Override
	public User findByUserName(String userName) {
		return restTemplate.getForObject("http://microservice-provider/user/" + userName, User.class);
	}

	@Override
	public User fallback(String userName) {
		log.info("异常发⽣，进⼊fallback⽅法，接收的参数：userName = {}", userName);
		User user = new User();
		user.setId(-1L);
		user.setUserName("default username");
		user.setCreateDate(new Date());
		return user;
	}

}
