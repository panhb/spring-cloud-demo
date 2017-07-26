package com.panhb.cloud.mq.client.recevier;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Component
@RabbitListener(queues = "test")
public class Receiver {

    @RabbitHandler
    public void process(Date date) {
        System.out.println("receiver======="+date.toString());
    }
}
