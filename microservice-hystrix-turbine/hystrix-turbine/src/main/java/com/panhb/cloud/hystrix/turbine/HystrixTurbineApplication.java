package com.panhb.cloud.hystrix.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author hongbo.pan
 */
@SpringBootApplication
@EnableTurbine
public class HystrixTurbineApplication {


	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
//		new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
	}

}
