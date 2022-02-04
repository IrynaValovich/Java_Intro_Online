package by.htp.string_and_basic_of_text_3.string_as_object;

import java.util.Scanner;

public class Task09LetterCounter {
	
	// Посчитать количество строчных(маленьких) и прописных(больших) букв в введенной строке. Учитывать только английские буквы.	 

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String originalString = getStringFromUser("Введи текст >> ");
		
		int lowerCaseCounter;		
		lowerCaseCounter = countLowerCaseLetters(originalString);		
		
		int upperCaseCounter;		
		upperCaseCounter = countUpperCaseLetters(originalString);		
		
		System.out.println("В строке \n" + lowerCaseCounter + " строчных букв и " + upperCaseCounter 
				+ " прописных");
	}
	
	private static String getStringFromUser(String message) {
		String value;
		do {
			System.out.println(message);
			value = scan.nextLine();
			
		} while(value.isBlank());
		return value;		 
	}
	
	private static int countLowerCaseLetters(String stringToCount) {
		int counter = 0;
		if (stringToCount != null) {
			for (int charIndex = 0; charIndex < stringToCount.length(); charIndex++) {
				char symbol = stringToCount.charAt(charIndex);
				if (symbol > 'a' && symbol < 'z') {
					counter++;
				}			
			}
		}		
		return counter;
	}
	
	private static int countUpperCaseLetters(String stringToCount) {
		int counter = 0;
		if (stringToCount != null) {
			for (int charIndex = 0; charIndex < stringToCount.length(); charIndex++) {
				char symbol = stringToCount.charAt(charIndex);
				if (symbol > 'A' && symbol < 'Z') {
					counter++;
				}
			}			
		}		
		return counter;		
	}
}
