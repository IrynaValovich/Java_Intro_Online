package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task20 {
	
	// Дана сторона равностороннего треугольника. Найти S этого треугольника, его высоту, R вписанной и описанной окружностей	 

	public static void main(String[] args) {		
		double a;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи сторону равностороннего треугольника >> ");
		a = scan.nextDouble();
		
		if (a <= 0) {
			System.out.println("Сторона треугольника не может принимать отрицательное и нулевое значения");
		} 
		if (a > 0) {			
			double s;			
			s = ((Math.pow(a, 2) * Math.sqrt(3)) / 4);		
			System.out.println("При длине стороны равной " + a + " площадь равностороннего треугольника = " + s);
			double h;
			h = (a * Math.sqrt(3) / 2);		
			System.out.println("Его высота = " + h);				
			double r1;
			r1 = (a * Math.sqrt(3) / 6);		
			System.out.println("Радиус вписанной окружности = " + r1);				
			double r2;
			r2 = (a * Math.sqrt(3) / 3);		
			System.out.println("Радиус описанной окружности = " + r2);			
		}		
	}
}
