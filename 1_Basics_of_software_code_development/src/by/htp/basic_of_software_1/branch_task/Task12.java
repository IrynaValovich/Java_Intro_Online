package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task12 {
	
	// Даны 3 действительные числа. Возвести в квадрат те, значения которых неотрицательны, в четвертую степень - отрицательные

	public static void main(String[] args) {
		double n;
		double x;
		double y;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи три действительных числа через Enter >> ");
		n = scan.nextDouble();
		x = scan.nextDouble();
		y = scan.nextDouble();		
		
		double nResult = (n >= 0) ? (n * n) : (n * n * n * n); 
		double xResult = (x >= 0) ? (x * x) : (x * x * x * x);
		double yResult = (y >= 0) ? (y * y) : (y * y * y * y);
		System.out.println("Результаты: \n" + nResult + "\n" + xResult + "\n" + yResult);
	}	
}
