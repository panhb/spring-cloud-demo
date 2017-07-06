package com.panhb.cloud.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPeer1ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPeer1ServerApplication.class, args);
	}

}
