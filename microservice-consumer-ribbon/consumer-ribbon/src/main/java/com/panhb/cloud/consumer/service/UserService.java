package com.panhb.cloud.consumer.service;

import com.panhb.cloud.consumer.entity.User;


public interface UserService {
	
	public User findByUserName(String userName);

}
