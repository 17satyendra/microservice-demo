package com.satya.sentence.model;

public class Word 
{
	private String word;
	
	public Word() {	}

	public Word(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String getString() {
		return getWord();
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
	
}
