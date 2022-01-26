package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task04 {
	
	// Составить программу: равны ли два числа a и b

	public static void main(String[] args) {		
		double a;
		double b;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите числа a и b через Enter >> ");		
		a = scanner.nextDouble();			
		b = scanner.nextDouble();
		boolean result;	
		result = (a == b) ? true : false;
		System.out.println(result);
	}
}
