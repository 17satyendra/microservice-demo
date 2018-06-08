package com.satya.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Project1EurekaServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1EurekaServicesApplication.class, args);
	}
}
