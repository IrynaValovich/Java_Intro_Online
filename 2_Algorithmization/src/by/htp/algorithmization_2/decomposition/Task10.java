package by.htp.algorithmization_2.decomposition;

public class Task10 {
	
	/*
	 * Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого 
	 * являются цифры числа N
	 */

	public static void main(String[] args) {		
		int number = 1321;		
		printArray(number);		
	}	
	
	private static int[] getDigits(int number) {		
		int count;	    
		count = Integer.toString(number).length();
		if (number < 0) {			
			count--;
		}
		int[] result = new int[count];
		while (count-- > 0) {
			result[count] = number % 10;
			number /= 10;
		}	    
		return result;
	}
	
	private static void printArray(int number) {
		for (int i = 0; i < getDigits(number).length; i++) {
			System.out.print("[" + getDigits(number)[i] + "] ");
		}
		System.out.println();
	}
}
