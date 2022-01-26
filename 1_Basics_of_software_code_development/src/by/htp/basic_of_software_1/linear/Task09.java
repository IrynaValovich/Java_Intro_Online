package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task09 {
	
	// Вычислить значение по формуле (a / c) * (b / d) - ((a * b - c) / (c * d))

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
		System.out.println("Введи значение переменной a >> ");
		a = scan.nextDouble();
		System.out.println("Введи значение переменной b >> ");
		b = scan.nextDouble();
		System.out.println("Введи значение переменной c >> ");
		c = scan.nextDouble();
		System.out.println("Введи значение переменной d >> ");
		d = scan.nextDouble();

		double func;
		func = (a / c) * (b / d) - ((a * b - c) / (c * d));

		if (c == 0 || d == 0) {
			System.out.println("Невозможно вычислить результат. Ошибка: Деление на ноль");        	
		} 
		if (c != 0 && d != 0) {
			System.out.println("Итог при а = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", значение функции = " + func);
		}    
	}
}
