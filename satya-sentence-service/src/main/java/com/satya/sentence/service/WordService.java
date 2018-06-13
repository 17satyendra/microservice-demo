package com.satya.sentence.service;

import com.satya.sentence.model.Word;

public interface WordService 
{
	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();
}
