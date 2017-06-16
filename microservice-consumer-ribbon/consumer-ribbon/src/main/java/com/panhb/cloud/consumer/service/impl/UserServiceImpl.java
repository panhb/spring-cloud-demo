package com.panhb.cloud.consumer.service.impl;


import com.panhb.cloud.consumer.entity.User;
import com.panhb.cloud.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public User findByUserName(String userName) {
		return restTemplate.getForObject("http://microservice-provider/user/" + userName, User.class);
	}

}
