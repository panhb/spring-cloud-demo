package com.panhb.cloud.provider.feign.hystrix.api.impl;

import com.panhb.cloud.api.model.UserDTO;
import com.panhb.cloud.provider.feign.hystrix.api.UserFeignHystrixService;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author hongbo.pan
 * @date 2019/3/29
 */
@Log
@Service
public class UserFeignHystrixServiceImpl implements UserFeignHystrixService {

    @Override
    public UserDTO findByUserName(String userName) {
        log.info("异常发⽣，进⼊fallback⽅法，接收的参数：userName = " + userName);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(-1L);
        userDTO.setUserName("default username");
        userDTO.setCreateDate(new Date());
        return userDTO;
    }
}
