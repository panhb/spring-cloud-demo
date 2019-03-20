package com.panhb.cloud.consumer.service;

import com.panhb.cloud.consumer.entity.User;


public interface UserHystrixService {
	
	User findByUserName(String userName);

	User fallback(String userName);

}
