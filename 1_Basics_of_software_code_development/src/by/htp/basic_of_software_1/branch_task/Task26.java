package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task26 {
	
	// Написать программу нахождения суммы большего и меньшего из трех чисел

	public static void main(String[] args) {		
		double n1;
		double n2;
		double n3;		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Введите первое число >> ");
		n1 = scanner.nextDouble();		
		System.out.print("Введите второе число >> ");
		n2 = scanner.nextDouble();		
		System.out.print("Введите третье число >> ");
		n3 = scanner.nextDouble();
		
		double sum;		
		if ((n1 > n2 && n2 > n3) || (n3 > n2 && n2 > n1) || (n3 > n1 && n3 == n2) || 
				(n1 == n2 && n1 > n3) || (n1 == n2 && n3 > n1)) {			
			sum = n1 + n3;			
			System.out.println("Сумма большего и меньшего значений равна " + sum);
			
		} else if ((n1 > n3 && n3 > n2) || (n2 > n3 && n3 > n1) || (n1 > n2 && n1 == n3) || 
				(n2 > n1 && n2 == n3) || (n1 == n3 && n2 > n1) || (n2 == n3 && n1 > n2)) {			
			sum = n1 + n2;			
			System.out.println("Сумма большего и меньшего значений равна " + sum);
			
		} else if ((n2 > n1 && n1 > n3) || (n3 > n1 && n1 > n2) || (n3 > n2 && n3 == n1)) {			
			sum = n2 + n3;			
			System.out.println("Сумма большего и меньшего значений равна " + sum);
			
		} else {			
			System.out.println("Упс! Среди равных нет больших и меньших:)");			
		}
	}	
}
