package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task28 {
	
	// Даны три числа a, b, c. Определить, какое из них равно d. Если ни одно не равно d, найти max(d-a, d-b, d-c)	 

	public static void main(String[] args) {		
		double a;
		double b;
		double c;
		double d;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите число a >> ");
		a = scanner.nextDouble();		
		System.out.print("Введите число b >> ");
		b = scanner.nextDouble();		
		System.out.print("Введите число c >> ");
		c = scanner.nextDouble();		
		System.out.print("Введите число d >> ");
		d = scanner.nextDouble();		
		
		if (d == a) {			
			System.out.println("Совпадение найдено! Число " + d + " = " + a);			
		} else if (d == b) {			
			System.out.println("Совпадение найдено! Число " + d + " = " + b);			
		} else if (d == c) {			
			System.out.println("Совпадение найдено! Число " + d + " = " + b);			
		} else {					
			double maxDA = Math.max(a, d);			
			double maxDB = Math.max(d, b);			
			double maxDC = Math.max(d, c);			
			System.out.println("Три максимума найдены: " + maxDA + ", " + maxDB + ", " + maxDC);			
			if (maxDA > maxDB && maxDA > maxDC) {				
				System.out.println("Максимальное значение из трех = " + maxDA);				
			} else if (maxDB > maxDA && maxDB > maxDC) {				
				System.out.println("Максимальное значение из трех = " + maxDB);				
			} else {				
				System.out.println("Максимальное значение из трех = " + maxDC);				
			}			
		}		
	}	
}
