package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task35 {
	
	// Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N

	public static void main(String[] args) {		
		int m;
		int n;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи два натуральных числа (M и N) через Enter >> ");
		m = scan.nextInt();
		n = scan.nextInt();
		
		if (m <= 0 || n <= 0) {
			System.out.println("Ошибка: числа не могут принимать отрицательные значения или равняться нулю");
		} 
		
		if (m > 0 && n > 0 ) {
			double result = (double) m / n;		
			int mLeast = (int) (result % 10); 
			int nHigh = ( 10 * (m % n) ) / n;		
			System.out.println(m + " / " + n + " = " + result);
			System.out.println("Старшая цифра дробной части: " + nHigh);
			System.out.println("Младшая цифра целой части: " + mLeast);	
		}	
	}
}
