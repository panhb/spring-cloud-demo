package com.panhb.cloud.provider.controller;


import com.panhb.cloud.provider.entity.User;
import com.panhb.cloud.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/instance-info")
	public ServiceInstance instanceInfo() {
		ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
		return localServiceInstance;
	}

	@RequestMapping("/getServices")
	public List<String> getServices() {
		List<String> services = discoveryClient.getServices();
		return services;
	}

	@RequestMapping("/user/{userName}")
	public User findByUserName(@PathVariable String userName) {
		User user = userService.findByUserName(userName);
		return user;
	}

}
