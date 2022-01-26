package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task08 {
	
	// Вычислить значение выражения по формуле ((sin x + cos y) / (cos x - sin y)) * tg xy;

	public static void main(String[] args) {			
		double x;
		double y;		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи значение для x >> ");
		x = scan.nextDouble();
		System.out.println("Введи значение для y >> ");
		y = scan.nextDouble();	
						
		double x1;
		double y1;		
		x1 = x * Math.PI / 180.0; // Перевод градусов в радианы
		y1 = y * Math.PI / 180.0;
				
		double result;			
		if (((x * y) == 90) || ((x * y) == 270) || ((x == 0 || x == 360) && y == 90)
				|| (x == 180 && y == 270)) {
			System.out.println("Вычислить результат невозможно! Ошибка: Недопустимая область значений");
		} else {
			result = (Math.sin(x1) + Math.cos(y1)) / (Math.cos(x1) - Math.sin(y1)) * Math.tan(x1 * y1);	
			System.out.println("Результат вычисления формулы при x = " + x + " градусов и y = " + y + " градусов равен " + result);
		}
	}
}
