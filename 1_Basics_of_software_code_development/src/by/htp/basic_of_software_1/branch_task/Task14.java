package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task14 {
	
	// Даны 2 угла треугольника в градусах. Определить, есть ли такой треугольник и прямоугольный ли он

	public static void main(String[] args) {				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи два угла треугольника (в градусах) через Enter >> ");
		int alpha;
		int beta;
		alpha = scan.nextInt();
		beta = scan.nextInt();	
		
		if (alpha > 0 && beta > 0) {			
			if (alpha + beta < 180) {			
				System.out.println("Треугольник существует");
				int hamma = 180 - alpha - beta;
				String result;
				result = (alpha == 90 || beta == 90 || hamma == 90) ? "Треугольник прямоугольный" : "Треугольник непрямоугольный"; 
				System.out.println(result);				
			} else {			
				System.out.println("Треугольника не существует");			
			}			
		} else {
			System.out.println("Невозможно вычислить результат. Углы треугольника не могут принимать отрицательное или нулевое значение");
		}		
	}	
}
