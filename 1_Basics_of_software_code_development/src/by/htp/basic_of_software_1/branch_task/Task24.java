package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task24 {
	
	/*
	 * Составить программу, определяющую результат гадания на ромашке
	 * Любит - не любит, взяв за исходное данное количество лепестков n
	 */

	public static void main(String[] args) {		
		int n;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print(" Введи количество лепестков >> ");
		n = scan.nextInt();
		
		if (n <= 0) {
			System.out.println("Лепестки не могут быть отрицательными или нулевыми");
		} else {
			String result;
			result = ((n + 1) % 2 == 0) ? "Любит" : "Не любит";
			System.out.println(result);			
		}
	}	
}
