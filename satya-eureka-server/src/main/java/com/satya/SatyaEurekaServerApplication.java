package com.satya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SatyaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatyaEurekaServerApplication.class, args);
	}
}
