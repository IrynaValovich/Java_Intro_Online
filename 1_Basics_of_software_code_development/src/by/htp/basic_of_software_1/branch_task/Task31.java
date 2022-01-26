package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task31 {
	
	/*
	 * Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
	 * Определить пройдет ли кирпич через отверстие
	 */

	public static void main(String[] args) {			
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите две стороны прямоугольного отверстия A и B >> ");	
		double a;
		double b;
		a = scanner.nextDouble();		
		b = scanner.nextDouble();
		if (a > 0 && b > 0) {
			System.out.print("Введите размеры кирпича x, y, z >> ");	
			double x;
			double y;
			double z;
			x = scanner.nextDouble();
			y = scanner.nextDouble();
			z = scanner.nextDouble();
			if (x > 0 && y > 0 && z > 0) {
				if (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b ||
						z <= a && x <= b || z <= a && y <= b || y <= a && z <= b) {			
					System.out.println("Кирпич пройдет в отверстие");			
				} else {			
					System.out.println("Кирпич не пройдет в отверстие");			
				}
			} else {
				System.out.println("Значения не могут быть отрицательными или нулевыми");
			}
		} else {
			System.out.println("Отверстия не существует");
		}		
	}	
}
