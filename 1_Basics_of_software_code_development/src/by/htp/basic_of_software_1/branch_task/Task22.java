package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task22 {
	
	// Перераспределить значения переменных x и y так, чтобы в x оказалось большее значение, а в y меньшее

	public static void main(String[] args) {		
		double x;
		double y;		
		@SuppressWarnings("resource")		
		Scanner read = new Scanner(System.in);		
		System.out.print("Введите значение x >> ");
		x = read.nextDouble();		
		System.out.print("Введите значение y >> ");
		y = read.nextDouble();
		
		double temp;		
		if (x < y) {			
			temp = x;			
			x = y;			
			y = temp;			
			System.out.println("x = " + x + ", y = " + y);			
		} else if (x == y) {			
			System.out.println("Упс! Х и у равны, а равные значения перераспределить невозможно");			
		} else {			
			System.out.println("Все значения на своих местах. Перераспределять ничего не нужно");			
		}
	}	
}
