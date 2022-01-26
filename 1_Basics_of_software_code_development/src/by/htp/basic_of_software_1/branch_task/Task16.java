package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task16 {
	
	// На плоскости XOY лежит точка А с заданными координатами. Указать где конкретно она находится.

	public static void main(String[] args) {		
		double x;
		double y;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи координаты точки А через Enter >> ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		
		if (x > 0 && y > 0) {			
			System.out.println("Точка А находится в I четверти плоскости");			
		} else if (x < 0 && y > 0) {			
			System.out.println("Точка А находится в II четверти плоскости");			
		} else if(x < 0 && y < 0) {			
			System.out.println("Точка А находится в III четверти плоскости");			
		} else if(x > 0 && y < 0) {			
			System.out.println("Точка А находится в IV четверти плоскости");			
		} else if (x == 0 && y == 0) {			
			System.out.println("Точка А лежит в начале системы координат");			
		} else if (x == 0 && y != 0) {			
			System.out.println("Точка А лежит на оси Y");			
		} else {			
			System.out.println("Точка А лежит на оси X");			
		}			
	}
}

