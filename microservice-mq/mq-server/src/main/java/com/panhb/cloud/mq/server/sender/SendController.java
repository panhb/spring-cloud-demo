package com.panhb.cloud.mq.server.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 * @date 2017/7/20
 */
@RestController
public class SendController {

    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    public String send(){
        sender.send();
        return "success";
    }
}
