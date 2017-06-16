package com.panhb.cloud.consumer.service;

import com.panhb.cloud.consumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-provider")
public interface UserService {

	@RequestMapping("/user/{userName}")
	public User findByUserName(@RequestParam("userName") String userName);

}
