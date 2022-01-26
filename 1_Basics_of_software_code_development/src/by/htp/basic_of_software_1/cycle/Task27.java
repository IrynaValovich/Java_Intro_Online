package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task27 {
	
	/*
	 * Для каждого натурального числа в промежутке от m до n вывести все делители
	 * Кроме единицы и самого числа. m и n вводятся с клавиатуры
	 */

	public static void main(String[] args)  {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите первое число (начальная позиция числового промежутка) >> ");
		int m;
		m = scanner.nextInt();		
		System.out.print("Введите второе число (конечная позиция числового промежутка) >> ");
		int n;
		n = scanner.nextInt();		
				
		if (n <= 0 || m <= 0) {
			System.out.println("Ошибка. Вы ввели либо отрицательное число, либо 0");	
			System.out.println("Перезапустите программу");			
		} else {			
			System.out.println("------------------------------------");
			System.out.printf("%-6s|%-10s\n","Число","Делители");// (-) выравнивание по левому краю, 6 и 10 мин.кол-во знаков
			System.out.println("------------------------------------");						
			for (int i = m; i <= n; i++) {// i числа в промежутке между m и n				
				for (int k = 2; k < i; k++) {					
					if (i % k == 0) {						
						System.out.printf("%-6s|%-10s\n", i, k);						
					}					
				}				
			}			
		}		
	}	
}
