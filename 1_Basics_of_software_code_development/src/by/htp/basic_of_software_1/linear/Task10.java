package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task10 {
	
	// Найти площадь прямоугольника. Ширина в 2 раза меньше длины

	public static void main(String[] args) {		
		double a;
		double b;
		double s;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.println("Введи значение длины >> ");
		a = scan.nextDouble();	
		
		if (a <= 0) {
			System.out.println("Длина не может быть отрицательной или нулевой");				
		} 
		if (a > 0) {
			b = a / 2;
			s = a * b;
			System.out.println("При a = " + a + " см, ширина составит " + b + " см");		
			System.out.println("Площадь прямоугольника = " + s + " см.кв.");
		}
	}
}
