package com.satya.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SatyaAdjectiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatyaAdjectiveServiceApplication.class, args);
	}
}
