package by.htp.string_and_basic_of_text_3.string_as_object;

import java.util.Scanner;

public class Task07DeleteSpacesAndRepeatedChars {
	
	// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String original = getTextFromUser("Введите текст >> ");	
		
		String without_repeats;		
		long start1 = System.nanoTime();
		without_repeats = deleteDups(original);
		long stop1 = System.nanoTime();
		
		String without_spaces;
		long start2 = System.nanoTime();
		without_spaces = deleteAllSpaces(without_repeats);
		long stop2 = System.nanoTime();
		
		System.out.println("Оригинальный текст: \n" + original);
		System.out.println("Текст без повторов символов: \n" + without_repeats);
		System.out.println("Время выполнения алгоритма: " + (stop1-start1));
		System.out.println("Результирующая строка без пробелов: \n" + without_spaces);
		System.out.println("Время выполнения алгоритма: " + (stop2-start2));
	}	
	
	private static String getTextFromUser(String message) {
		String value;
		do {
			System.out.println(message);
			value = scan.nextLine();
		} while (value.isBlank());
		return value;
	}
	
	private static String deleteDups(String stringToDelete) {
		if (stringToDelete.length() < 2) {
			return stringToDelete;
		}
		int potentialPosition = 1;
		char[] symbols = stringToDelete.toCharArray();
		for (int charIndex = 1; charIndex < stringToDelete.length(); charIndex++) {	
			int pastPosition;
			for (pastPosition = 0; pastPosition < charIndex; ++pastPosition) {
				if (symbols[charIndex] == symbols[pastPosition]) {
					break;
				}
			}
			if (pastPosition == potentialPosition) {
				symbols[potentialPosition] = symbols[charIndex];
				++potentialPosition;
			} else {
				symbols[potentialPosition] = 0;
				++potentialPosition;
			}
		}		
		return getStringWithoutDups(symbols);		
	}
	
	private static String getStringWithoutDups(char[] originalString) {
		StringBuilder result = new StringBuilder();
		for (char symbol : originalString) {
			if (symbol != 0) {
				result.append(symbol);
			}			
		}
		return result.toString();		
	}
	
	private static String deleteAllSpaces(String stringToDelete) {
		StringBuilder result = new StringBuilder();		
		for (int charIndex = 0; charIndex < stringToDelete.length(); charIndex++) {
			if (!Character.isWhitespace(stringToDelete.charAt(charIndex))) {
				result.append(stringToDelete.charAt(charIndex));
			}
		}
		return result.toString();
	}
}
