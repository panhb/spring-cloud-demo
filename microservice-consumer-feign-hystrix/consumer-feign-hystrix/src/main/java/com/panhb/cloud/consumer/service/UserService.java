package com.panhb.cloud.consumer.service;

import com.panhb.cloud.consumer.entity.User;
import com.panhb.cloud.consumer.service.UserService.HystrixClientFallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@FeignClient(name = "microservice-provider", fallback = HystrixClientFallback.class)
public interface UserService {

	@RequestMapping("/user/{userName}")
	public User findByUserName(@RequestParam("userName") String userName);

	@Component
	static class HystrixClientFallback implements UserService {
		private static final Logger log = LoggerFactory.getLogger(HystrixClientFallback.class);
		/**
		 * hystrix fallback⽅法
		 * @param userName userName
		 * @return 默认的⽤户
		 */
		public User findByUserName(String userName) {
			log.info("异常发⽣，进⼊fallback⽅法，接收的参数：userName = {}", userName);
			User user = new User();
			user.setId(-1L);
			user.setUserName("default username");
			user.setCreateDate(new Date());
			return user;
		}
	}

}
