package com.panhb.cloud.consumer.controller;


import com.panhb.cloud.consumer.entity.User;
import com.panhb.cloud.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/{userName}" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User findByUserName(@PathVariable String userName) {
		User user = userService.findByUserName(userName);
		return user;
	}

}
