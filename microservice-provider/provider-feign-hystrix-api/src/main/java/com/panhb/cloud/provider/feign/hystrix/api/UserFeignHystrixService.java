package com.panhb.cloud.provider.feign.hystrix.api;

import com.panhb.cloud.api.model.UserDTO;
import com.panhb.cloud.provider.feign.hystrix.api.impl.UserFeignHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hongbo.pan
 */
@FeignClient(name = "microservice-provider", fallback = UserFeignHystrixServiceImpl.class)
public interface UserFeignHystrixService {

	/**
	 * findByUserName
	 *
	 * @param userName
	 * @return UserDTO
	 */
	@RequestMapping("/user/{userName}")
	UserDTO findByUserName(@RequestParam("userName") String userName);

}
