package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task17 {
	
	/*
	 * Даны целые числа m и n. Если они не равны, заменить каждое из них одинаковым числом,
	 * равным большему из исходных, если равны - заменить числа нулями
	 */

	public static void main(String[] args) {		
		int m;
		int n;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи два целых числа m, n через Enter >> ");
		m = scan.nextInt();
		n = scan.nextInt();
		
		if (m != n) {			
			m = Math.max(m, n);			
			n = Math.max(m, n);			
		} else {			
			m = 0;			
			n = 0;			
		}		
		System.out.println("Полученные числа: m = " + m + ", n = " + n);		
	}
}

