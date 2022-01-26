package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task29 {
	
	// Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго числа

	public static void main(String[] args) {					
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите два числа через пробел >> ");
		long n1;
		long n2;
		n1 = scanner.nextLong();
		n2 = scanner.nextLong();

		byte d;
		long c;
		while (n1 != 0) {
			d = (byte)(n1 % 10);
			n1 = n1 / 10;
			c = n2;
			while (c > 0) {				
				if (d == c % 10) {					
					System.out.println("Цифра, входящая в запись как первого, так и второго числа: " + d);					
					break;
				}
				c = c / 10;
			}
		}		
	}
}
