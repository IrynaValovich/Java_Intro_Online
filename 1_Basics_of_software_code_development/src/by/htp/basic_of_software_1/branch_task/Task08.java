package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task08 {
	
	// Составить программу нахождения наименьшего из квадратов двух чисел a и b

	public static void main(String[] args) {		
		int a;
		int b;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи два числа через Enter >> ");
		a = scan.nextInt();
		b = scan.nextInt();	
		
		if (Math.abs(a) != Math.abs(b)) {
			int sqValue = 0;		
			if (Math.abs(a) < Math.abs(b)) {			
				sqValue = a * a;			
				System.out.println("Наименьший квадрат у числа a (" + a + ") и равен он " + sqValue);		
			} else {			
				sqValue = b * b;			
				System.out.println("Наименьший квадрат у числа b (" + b + ") и равен он " + sqValue);			
			}
		} else {
			System.out.println("Квадраты чисел равны");
		}		
	}
}
