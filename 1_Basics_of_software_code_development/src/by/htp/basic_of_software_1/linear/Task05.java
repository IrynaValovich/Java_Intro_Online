package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task05 {
	
	//Вычислить значение функции z = 2 * x + (y - 2) * 5

	public static void main(String[] args) {		
		double x;
		double y;		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи значение x >> ");
		x = scan.nextDouble();
		System.out.println("Введи значение y >> ");
		y = scan.nextDouble();
		
		double temp;					    
		temp = y - 2;
		temp = temp * 5;
			    
		double temp1;		
		temp1 = 2 * x;
			    
		double z;		
		z = temp1 + temp;		
		System.out.println("При x = " + x + " и y = " + y + " z = " + z);
	}
}
