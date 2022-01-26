package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task25 {
	
	/*
	 * Написать программу - модель анализа пожарного датчика в помещении.
	 * Если температура в комнате превысила 60 градусов по Цельсию,
	 * вывести на экран "Пожароопасная ситуация". 
	 */

	public static void main(String[] args) {
		double t;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Температура >> ");
		t = scan.nextDouble();
		
		if (t > 60) {
			System.out.println("Пожароопасная ситуация");			
		} else {			
			System.out.println("Температура в норме");			
		}
	}	
}
