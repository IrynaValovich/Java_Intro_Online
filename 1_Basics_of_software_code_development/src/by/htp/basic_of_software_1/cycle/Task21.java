package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task21 {
	
	/* 
	 * Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h.
	 * Результат представить в виде таблицы, первый столбец которой - значения аргумента,
	 * второй - соответствующие значения функции: F(x)=x-sin(x)
	 */

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи значения отрезка [a,b] через пробел >> ");
		double a;
		double b;
		a = scan.nextDouble();
		b = scan.nextDouble();
		System.out.println("Введи значения шага h >> ");
		double h;
		h = scan.nextDouble();		
		System.out.printf("%-7s|%-7s\n","x","F(x)");// (-) выравнивание по левому краю, 7 мин.кол-во знаков
		System.out.println("---------------");
		double x;		
		double fX = 0;
		for (x = a; x <= b; x = x + h) {			
			fX = x - Math.sin(x);			
			System.out.printf("%-7.4f|%-7.4f\n", x, fX);// (.4) ограничитель кол-ва символов после запятой			
		}		
		System.out.println();		
	}	
}
