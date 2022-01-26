package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task29 {
	
	// Даны 3 точки A(x1, y1), B(x2, y2), C(x3, y3). Определить, будут ли они расположены на одной прямой.

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи координаты (x и y) первой точки через пробел >> ");
		double x1;
		double y1;
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.println("Введи координаты (x и y) второй точки через пробел >> ");
		double x2;
		double y2;
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		System.out.println("Введи координаты (x и y) третьей точки через пробел >> ");
		double x3;
		double y3;
		x3 = scan.nextDouble();
		y3 = scan.nextDouble();
		
		// через уравнение прямой		
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки: A(" + x1 + ", " + y1 + "), B(" +	x2 + ", " + y2 + "), C(" + x3 + ", " + y3 
					+ ") лежат на одной прямой");			
		} else {			
			System.out.println("Точки: A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 
					+ ") не лежат на одной прямой");			
		}		
	}	
}
