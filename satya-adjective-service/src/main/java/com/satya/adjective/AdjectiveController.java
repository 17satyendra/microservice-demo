package com.satya.adjective;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdjectiveController
{
	@Value("${words}")
	private String words;

	@GetMapping(value = "/", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Word> getWord() 
	{
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		Word word = new Word();
		word.setWord(wordArray[i]);
		return new ResponseEntity<>(word, HttpStatus.OK);
	}

}
