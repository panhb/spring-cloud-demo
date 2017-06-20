package com.panhb.cloud.provider.service.impl;


import com.panhb.cloud.provider.entity.User;
import com.panhb.cloud.provider.repository.UserRepository;
import com.panhb.cloud.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User entity) {
		return userRepository.save(entity);
	}

	public boolean exists(Long id) {
		return userRepository.exists(id);
	}

	public long count() {
		return userRepository.count();
	}

	public void delete(Long id) {
		userRepository.delete(id);
	}

	public void delete(User entity) {
		userRepository.delete(entity);
	}

	public void delete(List<User> entities) {
		userRepository.delete(entities);
	}

	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
