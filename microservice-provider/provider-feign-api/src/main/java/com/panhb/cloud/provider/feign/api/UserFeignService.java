package com.panhb.cloud.provider.feign.api;

import com.panhb.cloud.api.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hongbo.pan
 */
@FeignClient(name = "microservice-provider")
public interface UserFeignService {

	/**
	 * findByUserName
	 *
	 * @param userName
	 * @return UserDTO
	 */
	@RequestMapping("/user/{userName}")
	UserDTO findByUserName(@RequestParam("userName") String userName);

}
