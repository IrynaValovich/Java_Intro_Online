package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task22 {
	
	/* 
	 * Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. 
	 * Результат представить в виде таблицы, первый столбец которой - значения аргумента, 
	 * второй - соответствующие значения функции: F(x)=sin^2(x)
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
		System.out.println("-----------------");
		System.out.printf("%-4s|%-8s\n","x","F(x)");
		System.out.println("-----------------");
		double x;		
		double fX = 0;
		for (x = a; x <= b; x = x + h) {			
			fX = Math.sin(x) * Math.sin(x);			
			System.out.printf("%-3.2f|%-8.5f\n", x, fX);			
		}		
		System.out.println("-----------------");		
	}
}
