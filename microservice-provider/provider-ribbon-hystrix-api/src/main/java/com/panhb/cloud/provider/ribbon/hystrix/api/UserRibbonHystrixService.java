package com.panhb.cloud.provider.ribbon.hystrix.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.panhb.cloud.api.model.UserDTO;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * @author hongbo.pan
 */
@Log
@Service
public class UserRibbonHystrixService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "findByUserNameFallback")
	public UserDTO findByUserName(String userName) {
		return restTemplate.getForObject("http://microservice-provider/user/" + userName, UserDTO.class);
	}

	private UserDTO findByUserNameFallback(String userName) {
		log.info("异常发⽣，进⼊fallback⽅法，接收的参数：userName = " + userName);
		UserDTO userDTO = new UserDTO();
		userDTO.setId(-1L);
		userDTO.setUserName("default username");
		userDTO.setCreateDate(new Date());
		return userDTO;
	}

}
