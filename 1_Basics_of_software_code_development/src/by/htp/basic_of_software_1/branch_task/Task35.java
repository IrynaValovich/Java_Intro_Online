package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task35 {
	
	// Вычислить число и месяц в невисокосном году по номеру дня

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введи порядковый номер дня >> ");		
		int day;
		day = scanner.nextInt();		 
		// создаю и инициализирую одномерный массив дней для 12 месяцев невисокосного года
		int[] month = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
		
		if (day <= 0 || day > 365) {			
			System.out.println("Что-то пошло не так. Перезагрузи программу");			
		} else {						
			for (int i = 0; day > month[i]; i++) {				
				day = day - month[i];				
			}		
			switch (i) {		
		        case 0 -> System.out.println("Январь");		        
		        case 1 -> System.out.println("Февраль");		        
		        case 2 -> System.out.println("Март");		        
		        case 3 -> System.out.println("Апрель");		        
		        case 4 -> System.out.println("Май");		        
		        case 5 -> System.out.println("Июнь");		        
		        case 6 -> System.out.println("Июль");		        
		        case 7 -> System.out.println("Август");		        
		        case 8 -> System.out.println("Сентябрь");		        
		        case 9 -> System.out.println("Октябрь");		        
		        case 10 -> System.out.println("Ноябрь");		        
		        case 11 -> System.out.println("Декабрь");		        
		      }		
		System.out.println(day);		
		}
	}	
}
