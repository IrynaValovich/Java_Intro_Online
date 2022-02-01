package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task06 {
	
	// Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 3;
		int[] array = new int [n];
		
		for (int i = 0; i < n; i++) {
			array[i] = getNumberFromUser("Введите целое число >> "); 
		}		
		
		int gcdArray;		
		gcdArray = findGCDForThreeNumbers(array);
		
		String result = isSimple(gcdArray) ? "Числа взаимнопростые" : "Числа не взаимнопростые";
		System.out.println(result);				 
	}
	
	private static int enterFromConsole(String message) {		
		System.out.print(message);		
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}		
		return scan.nextInt();		
	}
	
	private static int getNumberFromUser(String message) {
		int number;
		do {
			number = enterFromConsole(message);			
		} while (number <= 0);			
		return number;
	}
	
	private static int findGCD(int number1, int number2) {
		int result = 0;		
		for (int potentialNumber = 1; potentialNumber <= Math.max(number1, number2); potentialNumber++) {			
			if (number1 % potentialNumber == 0 && number2 % potentialNumber == 0) {
				result = potentialNumber;
			}			
		}
		return result;		
	}
	
	private static int findGCDForThreeNumbers(int[] arrayFromThreeNumbers) {			
		int gcdArray = arrayFromThreeNumbers[0];		
		for (int i = 1; i < arrayFromThreeNumbers.length; i++) {
			gcdArray = findGCD(gcdArray, arrayFromThreeNumbers[i]); 
		}			
		return gcdArray;
	}	
		
	private static boolean isSimple(int number) {		 
		return (number == 1) ? true : false;		
	}	
}
