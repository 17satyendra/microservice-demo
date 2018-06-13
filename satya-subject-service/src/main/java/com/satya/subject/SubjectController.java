package com.satya.subject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class SubjectController 
{
	@Value("${words}")
	private String words;

	@Value("${lucky-word}")
	String luckyWord;
	
	@GetMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getWord() 
	{
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		
		//HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		String v = wordArray[i];
		ObjectMapper om = new ObjectMapper();
		Map<String,String> map = new HashMap<>();
		map.put("word", v);
		
		String jv = null;
		try {
			jv = om.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String jv = "{word':'"+v+"'}";
		return new ResponseEntity<>(jv, HttpStatus.OK);
	}

}
