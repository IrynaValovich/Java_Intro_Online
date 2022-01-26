package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task06 {
	
	/*
	 * Напишите программу, где юзер вводит любое целое положительное число. А программа 
	 * суммирует все числа от 1 до введенного пользователем числа.
	 */

	public static void main(String[] args) {						
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите любое целое положительное число >> ");
		int number;
		number = scanner.nextInt();		
		if (number > 0) {			
			int sum = 0;			
			for (int i = 1; i <= number; i++) {				
				sum = sum + i;				
			}			
			System.out.println("Сумма чисел от 1 до " + number + " = " + sum);			
		} else {
			System.out.print("Ошибка! Вы ввели отрицательное число или ноль. Перезапустите программу ");
		}		
	}	
}
