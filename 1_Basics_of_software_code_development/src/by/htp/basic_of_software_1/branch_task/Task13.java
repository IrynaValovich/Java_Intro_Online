package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

/* Даны две точки А(х1,у1) и В(х2,у2). Составить алгоритм для определения, какая из точек
 * ближе к началу системы координат */

public class Task13 {	
	
	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double x1;
		double x2;
		double y1;
		double y2;
		System.out.println("Введи координаты (x,y) первой точки через Enter >>");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.println("Введи координаты (x,y) второй точки через Enter >>");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();	
		
		double length1;
		double length2;		
		length1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));		
		length2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		
		if (length1 != length2) {
			if (length1 > length2) {			
				System.out.println("Точка В ближе к началу системы координат");			
			} else {			
				System.out.println("Точка А ближе к началу системы координат");			
			}			
		} else {
			System.out.println("Обе точки находятся на одинаковом расстоянии от начала системы координат");
		}		
	}	
}
