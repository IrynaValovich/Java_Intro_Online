package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task11 {
	
	// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов

	public static void main(String[] args) {		
		double a;
		double b;		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи длину катета a >> ");
		a = scan.nextDouble();
		System.out.println("Введи длину катета b >> ");
		b = scan.nextDouble();
		
		if (a <= 0 || b <= 0) {
			System.out.println("Недопустимое значение! Длина не может быть отрицательной или нулевой");
		}
		
		double c;
		double p;
		double s;
		if (a > 0 && b > 0) {
			c = Math.sqrt((a * a) + (b * b));
			p = a + b + c;
			s = (a * b) / 2;
			System.out.println("При длинах катетов а = " + a + " см и b = " + b + " см, гипотенуза = " + c + " см");		
			System.out.println("Периметр = " + p + " см");		
			System.out.println("Площадь = " + s + " см. кв.");			
		}	
	}	
}

