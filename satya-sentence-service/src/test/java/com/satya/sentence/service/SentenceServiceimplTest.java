package com.satya.sentence.service;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.satya.sentence.dao.AdjectiveDao;
import com.satya.sentence.dao.ArticleDao;
import com.satya.sentence.dao.NounDao;
import com.satya.sentence.dao.SubjectDao;
import com.satya.sentence.dao.VerbDao;
import com.satya.sentence.model.Word;


public class SentenceServiceimplTest 
{
	@Autowired
	private SentenceServiceImpl service;
	
	public void setUp()
	{
		//		Establish Mock Dependencies:
		SubjectDao subjectDao = Mockito.mock(SubjectDao.class);
		VerbDao verbDao = Mockito.mock(VerbDao.class);
		ArticleDao articleDao = Mockito.mock(ArticleDao.class);
		AdjectiveDao adjectiveDao = Mockito.mock(AdjectiveDao.class);
		NounDao nounDao = Mockito.mock(NounDao.class);
		
		service.setSubjectDao(subjectDao);
		service.setVerbDao(verbDao);
		service.setArticleDao(articleDao);
		service.setAdjectiveDao(adjectiveDao);
		service.setNounDao(nounDao);
		
		//		Describe Mock Behaviors:
		Mockito.when(subjectDao.getWord()).thenReturn("1");
		Mockito.when(verbDao.getWord()).thenReturn("2");
		Mockito.when(articleDao.getWord()).thenReturn("3");
		Mockito.when(adjectiveDao.getWord()).thenReturn("4");
		Mockito.when(nounDao.getWord()).thenReturn("5");
	}
	@Test
	public void test() {
		//	We should get the sentence built in the correct order:
		Assert.assertEquals("1 2 3 4 5.", service.buildSentence());
	}
}
