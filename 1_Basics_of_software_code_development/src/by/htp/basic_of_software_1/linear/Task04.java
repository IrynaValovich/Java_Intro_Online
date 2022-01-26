package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task04 {
	
	// Составить алгоритм нахождения среднего арифметического двух чисел

	public static void main(String[] args) {		
		double a;
		double b;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Введи значение первого числа >> ");
		a = scan.nextDouble();
		System.out.print("Введи значение второго числа >> ");
		b = scan.nextDouble();
		
		double average;
		average = (a + b) / 2.0;		
		System.out.println("При а = " + a + " и b = " + b + " Среднее арифметическое = " + average);
	}	
}
