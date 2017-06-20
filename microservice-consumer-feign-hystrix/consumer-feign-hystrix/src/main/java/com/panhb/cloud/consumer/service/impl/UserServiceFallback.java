package com.panhb.cloud.consumer.service.impl;

import com.panhb.cloud.consumer.entity.User;
import com.panhb.cloud.consumer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by admin on 2017/6/19.
 * @Service用于标注业务层组件
 * @Controller用于标注控制层组件
 * @Repository用于标注数据访问组件，即DAO组件
 * @Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
 */
@Component
public class UserServiceFallback implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceFallback.class);

    @Override
    public User findByUserName(String userName) {
        log.info("异常发⽣，进⼊fallback⽅法，接收的参数：userName = {}", userName);
        User user = new User();
        user.setId(-1L);
        user.setUserName("default username");
        user.setCreateDate(new Date());
        return user;
    }
}
