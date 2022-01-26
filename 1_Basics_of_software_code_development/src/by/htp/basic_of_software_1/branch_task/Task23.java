package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task23 {
	
	/*
	 * Определить правильность даты, введенной с клавиатуры (число от 1 до 31, месяц от 1 до 12).
	 * Если введены некорректные данные, сообщить об этом.
	 */

	public static void main(String[] args) {		
		int day;
		int month;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите день месяца (от 1 до 31) >> ");
		day = scanner.nextInt();		
		System.out.print("Введите номер месяца (от 1 до 12) >> ");
		month = scanner.nextInt();
				
		if (month == 1 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Января");			
		} else if (month == 2 && day >= 1 && day <= 28) {			
			System.out.println("Дата корректна и это " + day + " Февраля");			
		} else if (month == 3 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Марта");			
		} else if (month == 4 && day >= 1 && day <= 30) {			
			System.out.println("Дата корректна и это " + day + " Апреля");			
		} else if (month == 5 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Мая");			
		} else if (month == 6 && day >= 1 && day <= 30) {			
			System.out.println("Дата корректна и это " + day + " Июня");			
		} else if (month == 7 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Июля");			
		} else if (month == 8 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Августа");			
		} else if (month == 9 && day >= 1 && day <= 30) {			
			System.out.println("Дата корректна и это " + day + " Сентября");			
		} else if (month == 10 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Октября");			
		} else if (month == 11 && day >= 1 && day <= 30) {			
			System.out.println("Дата корректна и это " + day + " Ноября");			
		} else if (month == 12 && day >= 1 && day <= 31) {			
			System.out.println("Дата корректна и это " + day + " Декабря");			
		} else {			
			System.out.println("Дата некорректна");				
		}		
	}		
}
