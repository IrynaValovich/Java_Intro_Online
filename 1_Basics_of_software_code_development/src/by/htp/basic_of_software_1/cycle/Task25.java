package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task25 {
	
	/* 
	 * Требуется найти факториал числа, которое ввел пользователь.
	 * Факториал - это произведение натуральных чисел от 1 до самого числа, включая его.
	 * Для нуля факториал равен 1.
	 */

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите натуральное число >> ");		
		while(!scanner.hasNextLong()) {
			scanner.next();			
			System.out.print("Ой, что-то пошло не так. Попробуйте еще раз. Введите целое положительное число >> ");
		}	
		long n;
		n = scanner.nextLong();		
		if (n < 0) {
			System.out.println("Ошибка. Число отрицательное");	
			System.out.println("Перезапустите программу");			
		} else {			
			long factorial = 1;			
			if (n == 0) {				
				System.out.println("Факториал числа равен 1 (единице)");					
			} else {				
				for (int i = 1; i <= n; i++) {					
					factorial = i * factorial;
					System.out.println("Для числа " + i + " факториал равен " + factorial);
					if (factorial > Long.MAX_VALUE / i) {
						System.out.println("На " + i + "-ом этапе цикла при умножении числа " + i 
								+ " на произведение предыдущих чисел произошло переполнение\n"
								+ "Программа остановила вычисления");
					break;
					}								
				} 		
			}		
		}
	}
}
