package com.panhb.cloud.provider.repository;

import com.panhb.cloud.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author hongbo.pan
 */
@RepositoryRestResource(path = "user")
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	/**
	 * findByUserName
	 *
	 * @param userName
	 * @return User
	 */
	User findByUserName(@Param(value = "userName") String userName);

}
