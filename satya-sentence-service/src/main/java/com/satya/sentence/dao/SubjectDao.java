package com.satya.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.satya.sentence.model.Word;

@FeignClient(name = "SUBJECT-SERVICE")
public interface SubjectDao 
{
	@GetMapping("/")
	public String getWord();
}
