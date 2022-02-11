package by.htp.ac_task01.text;

public class TextView {	
	
	public static void printText(Text text) {		
		for (Sentence s : text.getText()) {
			for (Word w : s.getWords()) {
				System.out.print(w.getWord());
			}
			System.out.print(" ");
		}
		
	}
	
	public static void printHeading(Text text) {
		for (Sentence s : text.getHeading()) {
			for (Word w: s.getWords()) {
				System.out.print(w.getWord());
			}
			System.out.println();
		}
	}
}
