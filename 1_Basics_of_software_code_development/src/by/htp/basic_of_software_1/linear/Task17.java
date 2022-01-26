package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task17 {
	
	//Даны 2 числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел

	public static void main(String[] args) {		
		double a;
		double b;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи два числа через Enter >> ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		double averageArithmCube;
		averageArithmCube = ((Math.pow(a, 3) + Math.pow(b, 3)) / 2);
		System.out.println("Среднее арифметическое кубов чисел " + a + " и " + b + " = " + averageArithmCube);			
		
		double aModul = Math.abs(a);		
		double bModul = Math.abs(b);	
		double averageModul = Math.sqrt(aModul * bModul);		
		System.out.println("Среднее геометрическое модулей чисел " + a + " и " + b + " = " + averageModul);
	}	
}
