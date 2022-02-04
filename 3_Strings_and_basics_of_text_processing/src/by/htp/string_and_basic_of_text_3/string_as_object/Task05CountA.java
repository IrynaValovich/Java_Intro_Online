package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task05CountA {
	
	// Подсчитать, сколько раз среди символов заданной строки встречается буква 'a'

	public static void main(String[] args) {
		String name = new String("Подсчитать, сколько раз среди символов заданной строки встречается буква 'а'");
		char charToCount = 'а';
		int counter;
		
		long start = System.nanoTime();
		counter = countSymbolInString(name, charToCount);
		long stop = System.nanoTime();
		
		System.out.println("В строке \n" + name + "\nсимвол " + charToCount + " встречается " + counter + " раз");
		System.out.println("Время выполнения программы: " + (stop-start));
	}
	
	private static int countSymbolInString(String stringToCount, char charToCount) {
		int counter = 0;
		if (stringToCount != null) {
			for (char symbol : stringToCount.toCharArray()) {
				if (symbol == 'а') {
					counter++;
				}
			}			
		}		
		return counter;
	}
}
