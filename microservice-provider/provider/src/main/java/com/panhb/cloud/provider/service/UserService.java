package com.panhb.cloud.provider.service;

import com.panhb.cloud.provider.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
	
	public User findById(Long id);
	
	public List<User> findAll();
	
	public User save(User entity);
	
	public boolean exists(Long id);
	
	public long count();
	
	public void delete(Long id);
	
	public void delete(User entity);
	
	public void delete(List<User> entities);
	
	public void deleteAll();
	
	public User findByUserName(String userName);

}
