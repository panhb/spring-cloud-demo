package com.panhb.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPeer2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPeer2ServerApplication.class, args);
	}

}
