package com.satya.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.sentence.dao.AdjectiveDao;
import com.satya.sentence.dao.ArticleDao;
import com.satya.sentence.dao.NounDao;
import com.satya.sentence.dao.SubjectDao;
import com.satya.sentence.dao.VerbDao;

@Service
public class SentenceServiceImpl implements SentenceService 
{
	private VerbDao verbDao;
	private SubjectDao subjectDao;
	private ArticleDao articleDao;
	private AdjectiveDao adjectiveDao;
	private NounDao nounDao;
	
	@Override
	public String buildSentence() 
	{
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				subjectDao.getWord(),
				verbDao.getWord(),
				articleDao.getWord(),
				adjectiveDao.getWord(),
				nounDao.getWord() );
		return sentence;
	}
	@Autowired
	public void setVerbDao(VerbDao verbDao) {
		this.verbDao = verbDao;
	}
	@Autowired
	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}
	@Autowired
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	@Autowired
	public void setAdjectiveDao(AdjectiveDao adjectiveDao) {
		this.adjectiveDao = adjectiveDao;
	}
	@Autowired
	public void setNounDao(NounDao nounDao) {
		this.nounDao = nounDao;
	}
}
