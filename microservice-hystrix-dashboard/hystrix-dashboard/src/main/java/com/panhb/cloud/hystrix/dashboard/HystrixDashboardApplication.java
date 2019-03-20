package com.panhb.cloud.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author hongbo.pan
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {


	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
//		new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
	}

}
