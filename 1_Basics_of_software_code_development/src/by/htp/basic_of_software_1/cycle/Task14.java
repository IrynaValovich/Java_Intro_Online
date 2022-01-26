package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task14 {
	
	// Дано натуральное n. Вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

	public static void main(String[] args) {			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.println("Введи натуральное n >> ");
		int n;
		n = scan.nextInt();
		
		if (n > 0) {
			double sum = 0;						
			for (double i = 1; i <= n; i++) {			
				sum += (1 / i);					
				System.out.println("При n = " + i + " сумма = "  + sum);
			}						
		} else {
			System.out.println("Невозможно вычислить результат. Введенное число отрицательно или равно нулю");
		}				
	}
}
