package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task40 {
	
	// Вычислить значение функции: F(x) = {(-x^3+9), если x<=13; -(3/(x+1)), если x>13

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите значение x >> ");	
		double x;
		x = scanner.nextDouble();		
		
		double fX;
		if (x <= 13) {			
			fX = (-Math.pow(x, 3)) + 9;				
		} else {			
			fX = (-3 / (x + 1));			
		}		
		System.out.println("f(x) = " + fX);		
	}	
}
