package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task32 {
	 
	 // Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной
	 
	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введи три числа >> ");
		double number1;
		double number2;
		double number3;
		number1 = scanner.nextDouble();
		number2 = scanner.nextDouble();
		number3 = scanner.nextDouble();
		
		if ((number1 + number2) > 0) {			
			System.out.println("Сумма " + number1 + " и " + number2 + " положительна");			
		} else if ((number2 + number3) > 0) {			
			System.out.println("Сумма " + number2 + " и " + number3 + " положительна");			
		} else if ((number1 + number3) > 0) {			
			System.out.println("Сумма " + number1 + " и " + number3 + " положительна");			
		} else {			
			System.out.println("Сумма чисел отрицательна");
		}		
	}	
}
