package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task18 {
	
	// Подсчитать количество отрицательных чисел среди чисел a, b, c

	public static void main(String[] args) {		
		double a;
		double b;
		double c;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите число а >> ");
		a = scanner.nextDouble();		
		System.out.print("Введите число b >> ");
		b = scanner.nextDouble();		
		System.out.print("Введите число c >> ");
		c = scanner.nextDouble();
		
		int counter = 0;	
		if (a < 0) {			
			counter++;			
		}
		
		if (b < 0) {			
			counter++;			
		}
		
		if (c < 0) {			
			counter++;			
		}		
		System.out.println("Среди введенных чисел количество отрицательных составляет " + counter);		
	}
}

