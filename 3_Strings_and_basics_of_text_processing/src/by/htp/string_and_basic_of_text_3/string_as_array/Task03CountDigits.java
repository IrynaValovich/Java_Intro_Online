package by.htp.string_and_basic_of_text_3.string_as_array;

public class Task03CountDigits {
	
	// В строке найти количество цифр

	public static void main(String[] args) {
		String value = "1, 2, 3 are digits but 123 is a number";
		
		long start = System.nanoTime();
		int counter = countDigits(value);
		long stop = System.nanoTime();
		
		System.out.println("В строке\n" + value + "\n" + counter + " цифр");
		System.out.println("Время выполнения алгоритма: " + (stop-start));
	}
	
	private static int countDigits(String stringToCount) {
		int counter = 0;
		for (char symbol : stringToCount.toCharArray()) {
			if (symbol >= '0' && symbol <= '9') {
				counter++;
			}
		}
		return counter;
	}
}
