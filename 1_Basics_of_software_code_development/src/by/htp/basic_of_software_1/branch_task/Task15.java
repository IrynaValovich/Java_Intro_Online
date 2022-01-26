package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task15 {
	
	// Даны действительные числа x и y, не равные друг другу. Меньшее заменить половиной их суммы, большее - удвоенным произведением

	public static void main(String[] args) {		
		double x;
		double y;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи два действительных числа через Enter >> ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		
		if (x != y) {					
			double halfSum = (x + y) / 2;		
			double multiComp = 2 * (x * y);
			double xResult;
			double yResult;
			if (x < y) {
				xResult = halfSum;
				yResult = multiComp;
			} else {
				xResult = multiComp;
				yResult = halfSum;
			}
			System.out.println("При исходных x = " + x + " и y = " + y + ", новые значения будут: x = " + xResult + " и y = " + yResult);
		} else {
			System.out.println("Не соблюдается условие x != y");
		}				
	}	
}
