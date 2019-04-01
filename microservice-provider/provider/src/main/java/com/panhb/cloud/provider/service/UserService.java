package com.panhb.cloud.provider.service;

import com.panhb.cloud.api.model.UserDTO;

import java.util.List;

/**
 * @author hongbo.pan
 */
public interface UserService {

	/**
	 * findById
	 *
	 * @param id
	 * @return UserDTO
	 */
	UserDTO findById(Long id);

	/**
	 * findAll
	 *
	 * @return List<UserDTO>
	 */
	List<UserDTO> findAll();

	/**
	 * save
	 *
	 * @param userDTO
	 * @return UserDTO
	 */
	UserDTO save(UserDTO userDTO);

	/**
	 * exists
	 *
	 * @param id
	 * @return boolean
	 */
	boolean exists(Long id);

	/**
	 * count
	 *
	 * @return long
	 */
	long count();

	/**
	 * delete
	 *
	 * @param id
	 */
	void delete(Long id);

	/**
	 * delete
	 *
	 * @param userDTO
	 */
	void delete(UserDTO userDTO);

	/**
	 * delete
	 *
	 * @param userDTOList
	 */
	void delete(List<UserDTO> userDTOList);

	/**
	 * deleteAll
	 */
	void deleteAll();

	/**
	 * findByUserName
	 *
	 * @param userName
	 * @return UserDTO
	 */
	UserDTO findByUserName(String userName);

}
