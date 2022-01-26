package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task30 {
	
	// Даны действительные числа a, b, c. Удвоить их, если a>b>c, заменить их абсолютными значениями, если это не так.

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи действительные числа a, b, c через пробел >> ");
		double a;
		double b;
		double c;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();		
		
		if (a > b && b > c) {			
			a = 2 * a;			
			b = 2 * b;			
			c = 2 * c;			
			System.out.println("Удваиваю каждое число. Теперь а = " + a + ", b = " + b + ", c = " + c);			
		} else {			
			a = Math.abs(a);			
			b = Math.abs(b);			
			c = Math.abs(c);			
			System.out.println("Заменяю каждое число абсолютным значением. Теперь а = " + a + ", b = " + b + ", c = " + c);
		}		
	}	
}
