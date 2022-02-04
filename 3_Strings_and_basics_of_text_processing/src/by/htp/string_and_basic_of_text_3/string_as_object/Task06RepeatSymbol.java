package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task06RepeatSymbol {
	
	/*
	 *  Из заданной строки получить новую, повторив каждый символ дважды.
	 *  
	 *  Повторить - сделать еще раз. Повторить дважды - сделать еще раз + сделать еще раз.
	 *  То есть в строке должно быть по 3 одинаковых символа: оригинал, копия, копия.
	 */

	public static void main(String[] args) {
		String name = "Из заданной строки получить новую, повторив каждый символ дважды";
		String result;
		
		long start = System.nanoTime();		
		result = doubleRepeatEachCharString(name);
		long stop = System.nanoTime();
		
		System.out.println(result);
		System.out.println("Время выполнения программы: " + (stop-start));
	}
	
	private static String doubleRepeatEachCharString(String stringToRepeat) {		
		StringBuilder result = new StringBuilder(stringToRepeat.length() * 2);
		for (int charIndex = 0; charIndex < stringToRepeat.length(); charIndex++) {
			result.append(stringToRepeat.charAt(charIndex))
				  .append(stringToRepeat.charAt(charIndex))
			      .append(stringToRepeat.charAt(charIndex));
		}
		return result.toString();
	}
}
