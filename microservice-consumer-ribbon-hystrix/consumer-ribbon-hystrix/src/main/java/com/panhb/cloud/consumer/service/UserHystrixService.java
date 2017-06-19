package com.panhb.cloud.consumer.service;

import com.panhb.cloud.consumer.entity.User;


public interface UserHystrixService {
	
	public User findByUserName(String userName);

	public User fallback(String userName);

}
