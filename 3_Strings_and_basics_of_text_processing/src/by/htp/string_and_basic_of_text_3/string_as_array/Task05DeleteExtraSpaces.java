package by.htp.string_and_basic_of_text_3.string_as_array;

public class Task05DeleteExtraSpaces {
	
	/*
	 *  Удалить в строке лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные.
	 *  Крайние пробелы в строке удалить.
	 */

	public static void main(String[] args) {
		String value = " This is a      test  string ";
		String result = deleteExtraSpaces(value);
		System.out.println("Исходная строка: \n" + value);
		System.out.println("Результирующая строка: \n" + result);

	}
	
	private static String deleteExtraSpaces(String stringToDelete) {
		char last = stringToDelete.charAt(0);
		StringBuilder result = new StringBuilder();
		
		for (int charIndex = 0; charIndex < stringToDelete.length(); charIndex++) {
			char symbol = stringToDelete.charAt(charIndex);
			if (symbol != ' ' || last != ' ') {
				result.append(symbol);
				last = symbol;
			}
		}
		return result.toString();
	}
}
