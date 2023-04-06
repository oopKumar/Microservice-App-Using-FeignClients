package com.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudFeignCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignCartServiceApplication.class, args);
	}

}
