package by.htp.ac_task01.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private List<Sentence> text;
	private List<Sentence> heading;
	
	public Text() {
		text = new ArrayList<Sentence>();
		heading = new ArrayList<Sentence>();
	}
	
	public Text(List<Sentence> text, List<Sentence> heading) {
		this.text = text;
		this.heading = heading;
	}
	
	public List<Sentence> getText(){
		return text;
	}
	
	public List<Sentence> getHeading(){
		return heading;
	}
	
	public void addSentences(Sentence... sentence) {
		for (int i = 0; i < sentence.length; i++) {
			text.add(sentence[i]);
		}		
	}	

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[text: " + getText() + ", heading: " + getHeading() + "]";
	}
}
