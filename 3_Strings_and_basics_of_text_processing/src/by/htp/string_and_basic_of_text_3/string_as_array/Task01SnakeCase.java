package by.htp.string_and_basic_of_text_3.string_as_array;

public class Task01SnakeCase{
	
	// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

	public static void main(String[] args) {
		String camelCase = ("theFirstName, theSecondName, theThirdName");		
		
		long start = System.nanoTime();
		String snake_case = transformCamelToSnake(camelCase);
		long stop = System.nanoTime();		
		
		System.out.println(snake_case);
		System.out.println("Время выполнения алгоритма: " + (stop - start));		
	}	
	
	private static String transformCamelToSnake(String stringToTransform) {
		StringBuilder result = new StringBuilder(stringToTransform.length());
		for (char symbol : stringToTransform.toCharArray()) {
			if (Character.isUpperCase(symbol)) {
				if (result.length() > 0) {
					result.append('_');
				}
				result.append(Character.toLowerCase(symbol));
			} else {
				result.append(symbol);
			}
		}
		return result.toString();
	}
}
