package com.panhb.cloud.config.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这边的@RefreshScope注解不能少，否则即使调⽤/refresh post请求，配置也不会刷新
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${test.a.b.c}")
    private String test;

    @GetMapping("/test")
    public String test() {
        return this.test;
    }
}
