package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task26 {
	
	// Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами y

	public static void main(String[] args) {		
		double a;
		double b;
		double y;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи длину стороны а >> ");
		a = scan.nextDouble();
		System.out.println("Введи длину стороны b >> ");
		b = scan.nextDouble();
		System.out.println("Введи числовое значение угла между ними (в градусах) >> ");
		y = scan.nextDouble();		
		
		if (a <= 0 || b <= 0 || y <= 0 || y >= 180) {
			System.out.println("Ошибка: Недопустимые значения исходных данных");
		} 
		if (a > 0 && b > 0 && y > 0 && y < 180) {
			double yRadian = y * Math.PI / 180;			
			double s = 0.5 * a * b * Math.sin(yRadian);
			System.out.println("Площадь треугольника при a = " + a + ", b = " + b + " и угле y = " + y + " равна " + s);
		}			
	}
}
