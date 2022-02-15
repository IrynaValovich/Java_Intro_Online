package by.htp.ac_task05.view;

import java.util.Scanner;

public class Input {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static int enterFromConsole(String message) {					
		System.out.print(message);					
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}					
		return scan.nextInt();					
	}
	
	public static int getNumberFromUser(String message) {
		int number;
		do {
			number = enterFromConsole(message);			
		} while (number < 0);			
		return number;
	}
}
