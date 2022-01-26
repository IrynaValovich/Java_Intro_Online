package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task20 {
	
	// Определить, делителем каких чисел а, b, с является число k

	public static void main(String[] args) {		
		int a;
		int b;
		int c;
		int k;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи числа а, b, с через Enter >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		System.out.println("Введи число k >> ");
		k = scan.nextInt();	
        
        if (a % k == 0) {        	
            System.out.println("Число " + k + " является делителем числа " + a);            
        }
        
        if (b % k == 0) {        	
            System.out.println("Число " + k + " является делителем числа " + b);            
        }
        
        if (c % k == 0) {        	
            System.out.println("Число " + k + " является делителем числа " + c);            
        }
	}	
}
