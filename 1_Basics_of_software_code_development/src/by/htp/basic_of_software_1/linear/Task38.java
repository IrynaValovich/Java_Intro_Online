package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task38 {	

/* 
 * Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случае 
 */
	
	public static void main(String[] args) {		
		double x, y;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите координаты x, y через Enter >> ");		
		x = scanner.nextDouble();		      
		y = scanner.nextDouble();

		// случай а)               
		System.out.println(((y + Math.abs(x)) <= 4) && (y >= 0));

		// случай b)           
		System.out.println((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4));

		// случай c)           
		System.out.println(((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0));        
	}
}
