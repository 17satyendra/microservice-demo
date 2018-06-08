package com.satya.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "ADJECTIVE-SERVICE")
public interface AdjectiveDao 
{
	@GetMapping("/")
	public String getWord();
	
}
