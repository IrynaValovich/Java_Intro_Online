package by.htp.string_and_basic_of_text_3.string_as_object;

import java.util.Scanner;

public class Task08FindLongestWord {
	
	/*
	 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
	 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] words = getWordsFromUser("Введи слова через пробелы >> ");
		
		String maxLengthWord;		
		long start = System.nanoTime();
		maxLengthWord = findLongestWord(words);
		long stop = System.nanoTime();
		
		System.out.println("Самое длинное слово в строке: " + maxLengthWord);
		System.out.println("Время выполнения программы: " + (stop-start));
	}	
	
	private static String[] getWordsFromUser(String message) {
		String value;
		do {
			System.out.println(message);			
			value = scan.nextLine();
		} while(value.isBlank());
		return value.split("\\s");
	}
	
	private static String findLongestWord(String[] stringsToSearch) {
		String compare = new String();
		for (String word : stringsToSearch) {
			if (word.length() > compare.length()) {
				compare = word;
			}
		}
		return compare;
	}
}
