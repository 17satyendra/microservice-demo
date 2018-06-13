package com.satya.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SatyaZuulGatewayApplication{

	public static void main(String[] args) {
		SpringApplication.run(SatyaZuulGatewayApplication.class, args);
	}
	@Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }
}
