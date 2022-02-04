package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task02PutCharAfterAnotherChar {
	
	// В строке вставить после каждого символа а символ b.

	public static void main(String[] args) {
		String text = new String("Whatever happens  , I'll leave it all to chance"
				+ "Another heartache,  another failed romance, on and on       ");
		
		long start = System.nanoTime();
		String result = putCharAfterEachAnotherChar(text, 'a', 'b');
		long stop = System.nanoTime();
		
		System.out.println("Исходная строка \n" + text);
		System.out.println("Результирующая строка \n" + result);
		System.out.println("Время выполнения программы: " + (stop-start));
	}
	
	private static String putCharAfterEachAnotherChar(String stringToPut, char symbolBefore, char symbolAfter) {
		StringBuilder result = new StringBuilder();
		if (stringToPut != null) {
			for (int charIndex = 0; charIndex < stringToPut.length(); charIndex++) {
				char symbol = stringToPut.charAt(charIndex);
				result.append(symbol);
				if (symbol == symbolBefore) {
					result.append(symbolAfter);
				}
			}
		}
		return result.toString();		
	}
}
