package by.htp.ac_task01.text;

public class Word {
	
	private final String word;	
	
	public Word(final String word) {
		this.word = word;
		if (this.word == null) {
			throw new IllegalArgumentException("null на входе");
		}
	}
	
	public String getWord() {
		return word;
	}	

	@Override
	public String toString() {
		return getWord();
	}
}
