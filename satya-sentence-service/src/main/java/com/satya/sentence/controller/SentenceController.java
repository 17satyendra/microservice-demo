package com.satya.sentence.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.sentence.service.SentenceService;

@RestController
public class SentenceController 
{
/*	@Autowired
	private RestTemplate template;*/
	
	@Autowired 
	private SentenceService sentenceService;

	@GetMapping("/sentence")
	public String getSentence() {
		return "<h3>Some Sentences</h3><br/>" +	  
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>"
				;
	}
	/*public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		try{
			sentence =  
				String.format("%s %s %s %s %s.",
					getWord("SUBJECT-SERVICE"),
					getWord("VERB-SERVICE"),
					getWord("ARTICLE-SERVICE"),
					getWord("ADJECTIVE-SERVICE"),
					getWord("NOUN-SERVICE") );			
		} catch ( Exception e ) {
			System.out.println(e);
		}
		return sentence;
	}
	public String getWord(String service) {
		return template.getForObject("http://" + service, String.class);
	
	}*/

}
