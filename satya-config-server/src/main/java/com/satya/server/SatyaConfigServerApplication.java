package com.satya.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SatyaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SatyaConfigServerApplication.class, args);
	}
}
