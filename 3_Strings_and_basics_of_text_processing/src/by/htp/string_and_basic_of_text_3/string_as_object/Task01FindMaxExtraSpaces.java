package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task01FindMaxExtraSpaces {
	
	// Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.

	public static void main(String[] args) {
		String text = new String("Whatever happens  , I'll leave it all to chance  "
				+ "Another heartache,  another failed romance, on and on       ");
		
		long start = System.nanoTime();
		int counter = findMaxExtraSpaces(text);
		long stop = System.nanoTime();
		
		System.out.println("В строке \n" + text + "\n" + "самое большое число подряд идущих пробелов = " 
				+ counter);
		System.out.println("Время выполнения программы " + (stop-start));
	}
	
	private static int findMaxExtraSpaces(String stringToFind) {
		int max = 0;
		int counter = 0;
		if (stringToFind != null) {			
			for (int charIndex = 0; charIndex < stringToFind.length(); charIndex++) {
				if (stringToFind.charAt(charIndex) == ' ') {
					counter++;
					if (counter > max) {
						max = counter;
					}
				} else {
					counter = 0;
				}
			}
		}		
		return max;		
	}
}
