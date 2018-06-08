package com.satya.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SatyaSubjectServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatyaSubjectServiceApplication.class, args);
	}
}
