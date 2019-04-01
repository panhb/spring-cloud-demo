package com.panhb.cloud.provider.ribbon.api;

import com.panhb.cloud.api.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hongbo.pan
 */
@Service
public class UserRibbonService {

	@Autowired
	private RestTemplate restTemplate;

	public UserDTO findByUserName(String userName) {
		return restTemplate.getForObject("http://microservice-provider/user/" + userName, UserDTO.class);
	}

}
