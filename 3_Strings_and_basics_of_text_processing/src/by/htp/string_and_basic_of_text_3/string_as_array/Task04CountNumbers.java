package by.htp.string_and_basic_of_text_3.string_as_array;

public class Task04CountNumbers {
	
	// В строке найти количество чисел

	public static void main(String[] args) {
		String value = "I was born on March 21-th in 1986";		
		
		long start = System.nanoTime();
		int counter = countNumbers(value);
		long stop = System.nanoTime();
		
		System.out.println("В строке \n" + value + "\n" + counter + " числа");
		System.out.println("Время выполнения программы: " + (stop-start));
	}
	
	private static int countNumbers(String stringToCount) {
		int counter = 0;		
		for (int charIndex = 0; charIndex < stringToCount.length(); charIndex++) {
			if (Character.isDigit(stringToCount.charAt(charIndex))) {				
				for (int j = charIndex; j < stringToCount.length(); j++) {
					if (!Character.isDigit(stringToCount.charAt(j))) {
						j = charIndex;
						counter++;
						break;
					}
				}
				
			}			
		}		
		return counter;
	}
}
