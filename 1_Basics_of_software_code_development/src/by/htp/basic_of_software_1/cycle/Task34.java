package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task34 {
	
	// Найдите количество четных цифр данного натурального числа

	public static void main(String[] args) {		
		@SuppressWarnings("resource")		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Введите натуральное число (целое, положительное, не ноль) >> ");		
		while(!scan.hasNextInt()) {
			scan.next();			
			System.out.print("Ой, что-то пошло не так. Попробуйте еще раз. Введите целое положительное число >> ");
		}
		int number;		
		number = scan.nextInt();
		
		if (number <= 0) {
			System.out.println("Ошибка. Число отрицательное или имеет значение 0");	
			System.out.println("Перезапустите программу");			
		} else {
			int	count = 0;			
			while (number > 0) {				
				if ((number % 10) % 2 == 0) {					
					count++;					
				}				
				number = number / 10;			
			}		
		System.out.println("Количество четных цифр = " + count);
		}
	}
}
