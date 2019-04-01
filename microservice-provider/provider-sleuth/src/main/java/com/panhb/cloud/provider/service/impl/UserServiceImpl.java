package com.panhb.cloud.provider.service.impl;

import com.google.common.collect.Lists;
import com.panhb.cloud.api.model.UserDTO;
import com.panhb.cloud.provider.entity.User;
import com.panhb.cloud.provider.repository.UserRepository;
import com.panhb.cloud.provider.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hongbo.pan
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO findById(Long id) {
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(userRepository.findById(id).get(), userDTO);
		return userDTO;
	}

	@Override
	public List<UserDTO> findAll() {
		List<UserDTO> list = Lists.newArrayList();
		BeanUtils.copyProperties(userRepository.findAll(), list);
		return list;
	}

	@Override
	public UserDTO save(UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		user = userRepository.save(user);
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

	@Override
	public boolean exists(Long id) {
		return userRepository.existsById(id);
	}

	@Override
	public long count() {
		return userRepository.count();
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public void delete(UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		userRepository.delete(user);
	}

	@Override
	public void delete(List<UserDTO> userDTOList) {
		List<User> list = Lists.newArrayList();
		BeanUtils.copyProperties(userDTOList, list);
		userRepository.deleteAll(list);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	public UserDTO findByUserName(String userName) {
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(userRepository.findByUserName(userName), userDTO);
		return userDTO;
	}

}
