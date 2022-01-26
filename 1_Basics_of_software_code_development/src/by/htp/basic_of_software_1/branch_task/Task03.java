package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task03 {
	
	/*
	 * Составить программу сравнения введенного числа a и цифры 3.
	 * Вывести на экран yes, если a < 3, если больше, то вывести no.
	 */

	public static void main(String[] args) {		
		double a;				
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите значение числа a: >> ");		
		a = scanner.nextDouble();
		
		String result;
		double compareDigit = 3;
		result = (a < compareDigit) ? "Yes!" : "No!";
		System.out.println(result);				
	}	
}
