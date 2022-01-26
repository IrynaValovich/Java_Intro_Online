package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task38 {
	
	// Вычислить значение функции: F(x) = {x^2, если 0<=x<=3; 4, если x>3 или x<0

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введи значение x >> ");
		double x;
		x = scanner.nextDouble();		
		
		double fX;
		if (x >= 0 && x <= 3) {			
			fX = x * x;			
		} else {			
			fX = 4;			
		}		
		System.out.println("f(x) = " + fX);
	}
}
