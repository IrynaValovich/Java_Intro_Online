package by.htp.basic_of_software_1.branch_task;

public class Task01 {
	
	/* Составить программу сравнения двух чисел 1 и 2. Если 1 < 2, на экран идет цифра 7. 
	 * В противном случае на экране появляется цифра 8
	 */

	public static void main(String[] args) {		
		int number1 = 1;
		int number2 = 2;
		int result;
		result = (number1 < number2) ? 7 : 8;
		System.out.println(result);			
	}
}
