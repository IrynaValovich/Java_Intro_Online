package by.htp.string_and_basic_of_text_3.string_as_array;

public class Task02WordToLetter {
	
	// Замените в строке все вхождения 'word' на 'letter'

	public static void main(String[] args) {
		String word = "The best word in the world is Java and this word has four letters";		
		
		long start = System.nanoTime();
		String result = changeWordToLetter(word);
		long stop = System.nanoTime();		
		
		System.out.println("Оригинальная строка\n" + word);
		System.out.println("Результирующая строка\n" + result);
		System.out.println("Время выполнения программы: " + (stop-start));		
	}
	
	private static String changeWordToLetter(String stringToChange) {
		StringBuilder result = new StringBuilder();
		for (int charIndex = 0; charIndex < stringToChange.length(); charIndex++) {
			if (charIndex + 3 < stringToChange.length() && 
					stringToChange.charAt(charIndex) == 'w' &&
					stringToChange.charAt(charIndex + 1) == 'o' &&
					stringToChange.charAt(charIndex + 2) == 'r' &&
					stringToChange.charAt(charIndex + 3) == 'd') {
				result.append("letter");
				charIndex = charIndex + 3;
			} else {
				result.append(stringToChange.charAt(charIndex));
			}
		}
		return result.toString();
	}
}
