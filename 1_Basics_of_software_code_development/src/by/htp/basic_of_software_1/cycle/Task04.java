package by.htp.basic_of_software_1.cycle;

public class Task04 {
	
	// С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно

	public static void main(String[] args) {
		int i = 2;
		while (i <= 100) {			
			System.out.println(i + " ");			
			i = i + 2;			
		}
	}	
}
