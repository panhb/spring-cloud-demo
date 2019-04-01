package com.panhb.cloud.consumer.controller;

import com.panhb.cloud.api.model.UserDTO;
import com.panhb.cloud.provider.feign.api.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongbo.pan
 */
@RestController
public class UserController {
	
	@Autowired
	private UserFeignService userFeignService;

	@RequestMapping(value = "/user/{userName}" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserDTO findByUserName(@PathVariable String userName) {
		return userFeignService.findByUserName(userName);
	}

}
