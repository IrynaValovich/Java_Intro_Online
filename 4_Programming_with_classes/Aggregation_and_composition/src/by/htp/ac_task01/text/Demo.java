package by.htp.ac_task01.text;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести текст на консоль, 
 * вывести на консоль заголовок текста.
 */

public class Demo {

	public static void main(String[] args) {
		
		Text text = new Text();
		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence heading = new Sentence();
		
		Word word1 = new Word("Java");
		Word word2 = new Word("is");
		Word word3 = new Word("the");
		Word word4 = new Word("best");
		Word word5 = new Word("program");
		Word word6 = new Word("language");
		Word word7 = new Word(".");
		Word word8 = new Word(" ");		
		
		sentence1.addWords(word1, word8, word2, word8, word3, word8, word4, word8, word5, word8, word6, word7);			
		sentence2.addWords(word1, word8, new Word("это"), word8, new Word("язык"), word8, new Word("программирования"), word7);		
		
		heading.addWords(word1, word8, new Word("story"));
		
		text.getHeading().add(heading);
		TextView.printHeading(text);
		
		text.addSentences(sentence1, sentence2);
		TextView.printText(text);
	}
}
