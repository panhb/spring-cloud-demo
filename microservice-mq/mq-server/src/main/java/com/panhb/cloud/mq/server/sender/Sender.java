package com.panhb.cloud.mq.server.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by admin on 2017/7/20.
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        amqpTemplate.convertAndSend("test",new Date());
    }
}
