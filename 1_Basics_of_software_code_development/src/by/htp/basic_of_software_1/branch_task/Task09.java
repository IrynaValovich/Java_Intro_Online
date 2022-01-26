package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task09 {
	
	/* Составить программу, которая определит по трем введенным сторонам,
	 * является ли данный треугольник равносторонним
	 */

	public static void main(String[] args) {		
		double a;
		double b;
		double c;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите длины треугольников через Enter >> ");
		a = scanner.nextDouble();		
		b = scanner.nextDouble();		
		c = scanner.nextDouble();
		
		if (a > 0 && b > 0 && c > 0) {
			if (a + b > c && a + c > b && b + c > a) {
				String result;
				result = (a == b || b == c || a == c) ? "Треугольник равносторонний" : "Треугольник неравносторонний";
				System.out.println(result);								
			} else {
				System.out.println("Упс! Это уже не треугольник");
			}					
		} else {
			System.out.println("Стороны треугольника не могут быть отрицательными либо равняться нулю");
		}
	}
}
