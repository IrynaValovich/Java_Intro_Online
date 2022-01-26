package by.htp.basic_of_software_1.branch_task;

public class Task02 {
	
	/*
	 * Составить программу сравнения двух чисел 1 и 2.
	 * Если 1 < 2, вывести на экран yes. В противном случае - слово no.
	 */

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 2;
		String result;
		result = (number1 < number2) ? "Yes" : "No";
		System.out.println(result);				
	}	
}

