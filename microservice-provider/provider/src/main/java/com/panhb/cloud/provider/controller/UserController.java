package com.panhb.cloud.provider.controller;

import com.panhb.cloud.api.model.UserDTO;
import com.panhb.cloud.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hongbo.pan
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/instance-info" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ServiceInstance instanceInfo() {
		ServiceInstance localServiceInstance = discoveryClient.getInstances("microservice-provider").get(0);
		return localServiceInstance;
	}

	@RequestMapping(value = "/getServices" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<String> getServices() {
		List<String> services = discoveryClient.getServices();
		return services;
	}

	@RequestMapping(value = "/user/{userName}" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserDTO findByUserName(@PathVariable String userName) {
		UserDTO userDTO = userService.findByUserName(userName);
		return userDTO;
	}

}
