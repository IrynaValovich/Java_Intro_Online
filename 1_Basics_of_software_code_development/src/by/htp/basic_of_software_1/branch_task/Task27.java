package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task27 {
	
	// Найти max{min(a, b), min(c, d)}

	public static void main(String[] args) {		
		double a;
		double b;
		double c;
		double d;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите числа a и b через пробел >> ");		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		
		System.out.print("Введите числа c и d через пробел >> ");		
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		
		// Вычисляю меньшее из двух чисел a, b		
		double minAB = 0;		
		if (a < b) {			
			minAB = a;			
			System.out.println("Меньшее из чисел a и b = " + minAB);			
		} else if (b < a) {			
			minAB = b;			
			System.out.println("Меньшее из чисел a и b = " + minAB);			
		} else {			
			minAB = a;			
			System.out.println("Числа равны, поэтому берем любое " + a);			
		}
		
		// Вычисляю меньшее из двух чисел c, d
		double minCD = 0;		
		if (c < d) {			
			minCD = c;			
			System.out.println("Меньшее из чисел c и d = " + minCD);			
		} else if (d < c) {			
			minCD = d;			
			System.out.println("Меньшее из чисел c и d = " + minCD);			
		} else {			
			System.out.println("Числа равны, поэтому берем любое " + c);			
		}
		
		// Вычисляю максимум из минимумов		
		double maxMIN = Math.max(minAB, minCD);		
		System.out.println("Максимальное значение среди минимальных = " + maxMIN);
	}	
}
