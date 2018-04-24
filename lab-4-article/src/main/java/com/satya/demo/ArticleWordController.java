package com.satya.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleWordController {
	
	@Value("${words:a}")
	String words;

	@GetMapping("/")
	public String getWord() {
		String[] wordArray = words.split(",");
		int i = (new Random()).nextInt(wordArray.length);
		return wordArray[i];
	}
}
