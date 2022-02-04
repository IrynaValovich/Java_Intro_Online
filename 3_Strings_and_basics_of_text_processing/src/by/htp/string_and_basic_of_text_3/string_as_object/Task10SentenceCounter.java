package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task10SentenceCounter {
	
	/*
	 *  Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, 
	 *  восклицательным или вопросительным знаком. Определить количество предложений в строке Х.
	 */

	public static void main(String[] args) {
		String sentence = "Первое предложение. Это - второе! Не нравятся предложения без глаголов? Мне тоже";
		
		int counter;
		long start = System.nanoTime();
		counter = countSentences(sentence);
		long stop = System.nanoTime();
		
		System.out.println("В строке\n" + sentence + "\n" + counter + " предложений");
		System.out.println("Время выполнения счетчика: " + (stop-start));
	}
	
	private static int countSentences(String stringToCount) {
		int counter = 0;
		if (stringToCount != null) {
			for (int charIndex = 0; charIndex < stringToCount.length(); charIndex++) {
				char symbol = stringToCount.charAt(charIndex);
				if (symbol == '.' || symbol == '!' || symbol == '?') {
					counter++;
				}
			}			
		}		
		return counter;
	}
}
