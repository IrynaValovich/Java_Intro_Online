package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task24 {
	
	/* 
	 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
	 * Преобразовать его в другое число, цифры которого будут следовать в обратном порядке
	 * по сравнению  с введенным числом.
	 */

	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите натуральное число (целое, положительное, не ноль) >> ");		
		while(!scanner.hasNextInt()) {
			scanner.next();			
			System.out.print("Ой, что-то пошло не так. Попробуйте еще раз. Введите целое положительное число >> ");
		}
		
		int number;
		number = scanner.nextInt();		
		if (number <= 0) {
			System.out.println("Ошибка. Число отрицательное или имеет значение 0");	
			System.out.println("Перезапустите программу");			
		} else {			
			int testNumber = number; // временная переменная для ввода number в цикл, чтобы не потерять number
			
			// Нахожу сумму четных цифр числа		
			int sum = 0;		
		    while (testNumber > 0) {	    	
		        if ((testNumber % 10) % 2 == 0) { 	        	
		        	sum = sum + testNumber % 10; 	        	
		        }	        
		        testNumber = testNumber / 10; 		        
		    }	
		    System.out.println("Сумма четных цифр числа " + number + " = " + sum);
		    
		    // Переворачиваю число так, чтобы его цифры шли в обратном порядке
		    
		    int reverseOrder = 0;
		    while (number != 0) {
		    	reverseOrder = reverseOrder * 10 + number % 10;
		    	number = number / 10;
		    }		   			
			System.out.println("Преобразованное число: " + reverseOrder);			
		}		
	}	
}
