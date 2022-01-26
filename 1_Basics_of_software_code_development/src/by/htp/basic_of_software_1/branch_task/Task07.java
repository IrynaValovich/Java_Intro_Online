package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task07 {
	
	// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		System.out.println("Введи значения переменных a, b, c и х через Enter >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		x = scan.nextInt();
		
		int z = (a * x * x + b * x + c);
		int result;
		result = (z < 0) ? (z * (-1)) : z;		
		System.out.println("Модуль равен " + result);
	}
}
