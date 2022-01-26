package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task32 {
	
	// Найдите наибольшую цифру данного натурального числа

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print("Введите натуральное число (целое, положительное, не ноль) >> ");		
		while(!scan.hasNextInt()) {
			scan.next();			
			System.out.print("Ой, что-то пошло не так. Попробуйте еще раз. Введите целое положительное число >> ");
		}
		int n;
		n = scan.nextInt();	
		
		if (n <= 0) {
			System.out.println("Ошибка. Число отрицательное или имеет значение 0");	
			System.out.println("Перезапустите программу");			
		} else {
			int max = 0;			
			while (n > 0) {				
				if (n % 10 > max) {					
					max = n % 10;					
				}				
				n = n / 10;					
			}			
			System.out.println("Самая большая цифра введенного числа: " + max);			
		}
	}
}
