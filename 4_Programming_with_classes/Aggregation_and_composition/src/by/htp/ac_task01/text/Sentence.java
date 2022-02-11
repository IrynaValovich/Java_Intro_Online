package by.htp.ac_task01.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	private List<Word> words;
	
	public Sentence() {
		words = new ArrayList<Word>();
	}
	
	public Sentence(List<Word> words) {
		this.words = words;
	}
	
	public void addWords(Word... word) {
		for (int i = 0; i < word.length; i++) {
			words.add(word[i]);
		}
	}	
	
	public List<Word> getWords(){
		return words;
	}
	
	public void setSentence(List<Word> words) {
		this.words = words;
	}
	
	@Override
	public String toString() {
		return getWords().toString();
	}
}
