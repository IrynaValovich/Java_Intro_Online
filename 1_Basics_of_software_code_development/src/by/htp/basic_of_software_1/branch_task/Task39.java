package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task39 {
	
	// Вычислить значение функции: F(x) = {(-x^2+x-9, если x>=8, 1/x^4-6, если x<8

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите значение x >> ");
		double x;
		x = scanner.nextDouble();		
		
		double fX;
		if (x >= 8) {			
			fX = (-Math.pow(x, 2)) + x - 9;				
		} else {			
			fX = 1 / (Math.pow(x, 4) - 6);			
		}		
		System.out.println("f(x) = " + fX);		
	}	
}
