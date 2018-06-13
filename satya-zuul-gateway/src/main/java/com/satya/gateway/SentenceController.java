package com.satya.gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SentenceController 
{
	@GetMapping("/hello")
	public String sentence() {
		return "sentence";
	}

}
