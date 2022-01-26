package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task01 {
	
	// Решить функцию z = ((a - 3) * b / 2) + c

	public static void main(String[] args) {		
		double a;
		double b;
		double c;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); 
		System.out.print("Введите значение для a: ");
		a = in.nextDouble(); 
		System.out.print("Введите значение для b: ");
		b = in.nextDouble();
		System.out.print("Введите значение для c: ");
		c = in.nextDouble();

		double temp;
		temp = a - 3;
		temp = temp * b;
		temp = temp / 2;
		
		double z = temp + c;
		System.out.println("При a = " + a + " b = " + b + " c = " + c + " z равняется " + z);
	}
}
