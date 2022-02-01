package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task14 {
	
	/*
	 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, 
	 * равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		int k = getFinishPointFromUser("Введи конечную точку диапазона поиска (число k) >> ");	
		
		System.out.println("Диапазон чисел от 1 до " + k + " включает следующие числа Армстронга: ");		
		
		long start = System.currentTimeMillis();		
		findNumArmstrong(k);		
		long stop = System.currentTimeMillis();		
		
		System.out.println("Время выполнения программы: " + (stop - start));		
	}
	
	private static int enterFromConsole(String message) {					
		System.out.print(message);					
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}					
		return scan.nextInt();					
	}
	
	private static int getFinishPointFromUser(String message) {
		int point;
		do {
			point = enterFromConsole(message);			
		} while (point <= 1);			
		return point;
	}
	
	private static void findNumArmstrong(int finalPoint) {		
		for (int i = 1; i < finalPoint; i++) {			
			int digit = 0;						
			for (int j = i; j > 1; j = j / 10) {
				digit++;
			}
			int input = i;
			int sum = 0;
			while (input > 1) {
				int n = (int)Math.pow(input%10, digit);
				sum += n;
				input = input / 10;				
			}
			if (sum == i) {
				System.out.print(i + " ");
		    }		
		}
		System.out.println();		
	}
}
