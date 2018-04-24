package com.satya.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
public class MicroservicesBootClientConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootClientConfigApplication.class, args);
	}
}
