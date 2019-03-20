package com.panhb.cloud.provider.service;

import com.panhb.cloud.provider.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
	
	User findById(Long id);
	
	List<User> findAll();
	
	User save(User entity);
	
	boolean exists(Long id);
	
	long count();
	
	void delete(Long id);
	
	void delete(User entity);
	
	void delete(List<User> entities);
	
	void deleteAll();
	
	User findByUserName(String userName);

}
