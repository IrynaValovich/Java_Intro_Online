package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task06 {
	
	// Составить программу: определения наибольшего из двух чисел a и b

	public static void main(String[] args) {		
		double a;
		double b;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите числа a и b >> ");
		a = scanner.nextDouble();		
		b = scanner.nextDouble();
		
		if (a != b) {
			if (a > b) {
				System.out.println("Число a = " + a + " больше числа b = " + b);
			} else {
				System.out.println("Число b = " + b + " больше числа a = " + a);
			}			
		} else {
			System.out.println("Числа равны");
		}
	}	
}
