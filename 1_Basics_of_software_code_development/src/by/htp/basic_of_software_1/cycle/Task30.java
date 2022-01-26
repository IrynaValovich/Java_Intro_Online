package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task30 {
	
	// Написать программу, переводящую римские цифры в арабские	 	

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print("Введите римское число (максимум MMMCMXCIX (3999)) >> ");		
		String roman;
		roman = scan.nextLine();		
		int i = 0; 
		int current = 0; 
		int start = 0;
		int result = 0;			
		while (i < roman.length()) {			
			char letter = roman.charAt(i); // буква в строке в текущей позиции			
			switch (letter) {			
			case 'I' -> current = 1;			
			case 'V' -> current = 5;			
			case 'X' -> current = 10;			
			case 'L' -> current = 50;			
			case 'C' -> current = 100;			
			case 'D' -> current = 500;			
			case 'M' -> current = 1000;			
			}
			
			if (current > start) {				
				result = result + current - (start * 2);				
			} else {				
				result = current + result;				
			}		
			start = current;			
			i = i + 1;			
		}		
		System.out.println("Число = " + result); 		
    }	
}
