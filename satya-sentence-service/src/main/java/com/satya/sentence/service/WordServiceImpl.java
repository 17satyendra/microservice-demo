package com.satya.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.satya.sentence.dao.AdjectiveDao;
import com.satya.sentence.dao.ArticleDao;
import com.satya.sentence.dao.NounDao;
import com.satya.sentence.dao.SubjectDao;
import com.satya.sentence.dao.VerbDao;
import com.satya.sentence.model.Word;

@Service
public class WordServiceImpl implements WordService 
{
	@Autowired VerbDao verbDao;
	@Autowired SubjectDao subjectDao;
	@Autowired ArticleDao articleDao;
	@Autowired AdjectiveDao adjectiveDao;
	@Autowired NounDao nounDao;
	
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public Word getSubject() {
		return subjectDao.getWord();
	}
	
	@Override
	public Word getVerb() {
		return verbDao.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleDao.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public Word getAdjective() {
		return adjectiveDao.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public Word getNoun() {
		return nounDao.getWord();
	}	

	public Word getFallbackSubject() {
		return new Word("Someone");
	}
	
	public Word getFallbackAdjective() {
		return new Word("");
	}
	
	public Word getFallbackNoun() {
		return new Word("something");
	}
}
