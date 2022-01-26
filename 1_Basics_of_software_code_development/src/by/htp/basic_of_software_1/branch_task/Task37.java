package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task37 {
	
	// Вычислить значение функции: F(x) = {(-x^2+3x+9), если x>=3; (1/(x^3-6)), если x<3

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введи значение x >> ");
		double x;
		x = scanner.nextDouble();		
		
		double fX;
		if (x >= 3) {			
			fX = ((-1) * (x * x)) + 3 * x + 9;			
		} else {			
			fX = 1 / (x * x * x - 6);			
		}		
		System.out.println("f(x) = " + fX);
	}	
}
