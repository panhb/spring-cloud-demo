package com.panhb.cloud.consumer.service;

import com.panhb.cloud.consumer.entity.User;


/**
 * @author hongbo.pan
 */
public interface UserHystrixService {
	
	User findByUserName(String userName);

	User fallback(String userName);

}
