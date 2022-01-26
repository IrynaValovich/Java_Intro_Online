package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task12 {
	
	// Вычислить расстояние между двумя точками с координатами (x1, y1) и (x2, y2)

	public static void main(String[] args) { 		
		double x1;
		double x2;
		double y1;
		double y2;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите координаты первой точки >> ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.println("Введите координаты второй точки >> ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		double length;		
		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));		
		System.out.println("При x1 = " + x1 + ", y1 = " + y1 + " и x2 = " + x2 
					+ ", y2 = " + y2 + ", расстояние между точками равно " + length);
	}	
}
