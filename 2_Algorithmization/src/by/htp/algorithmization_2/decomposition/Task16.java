package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task16 {
	
	/*
	 * Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
	 * Определить, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		int n;
		n = getNFromUser("Введи n-значность >> ");
		
		int sum;
		sum = getSumOfOddNumbers(n);		
		System.out.println("Сумма " + n + " - значных чисел, содержащих только нечетные цифры: " + sum);
		
		int evenCount;
		evenCount = findEvenDigitCounter(sum);
		System.out.println("В найденной сумме " + evenCount + " четных цифр");
	}
	
	private static int enterFromConsole(String message) {					
		System.out.print(message);					
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}					
		return scan.nextInt();					
	}
	
	private static int getNFromUser(String message) {
		int N;
		do {
			N = enterFromConsole(message);			
		} while (N <= 0);			
		return N;
	}
	
	private static int findNumberLength(int number) {		
		int numberLength = 0;
		while (number != 0) {
			numberLength++;
			number = number / 10;
		}		
		return numberLength;		
	}
	
	private static int getSumOfOddNumbers(int n) {		
		int start;
		start = (int)Math.pow(10, n - 1);
		
		int sum = 0;
		for (int i = start; i < start * 10; i++) {
			int temp = i;
			int numberLength = findNumberLength(i);
			while (temp != 0) {
				if ((temp % 10) % 2 != 0) {
					numberLength--;
				}
				temp = temp / 10;
			}
			if (numberLength == 0) {
				sum = sum + i;
			}
		}		
		return sum;
	}
	
	private static int findEvenDigitCounter(int number) {		
		int counter = 0;
		int numberLength = findNumberLength(number);
		for (int i = 1; i <= numberLength; i++) {
			int digit = (int)(number / Math.pow(10, i - 1)) % 10;
			if (digit % 2 == 0) {
				counter++;
			}
		}		
		return counter;
	}	
}
