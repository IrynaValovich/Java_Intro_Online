package by.htp.sc_task04.main;

import java.util.Scanner;

import by.htp.sc_task04.entity.Depo;
import by.htp.sc_task04.logic.TrainLogic;

public final class Input {
	
	private final Scanner scan;
	
	public Input() {
		scan = new Scanner(System.in);
	}	
	
	public int enterFromConsole(Depo depo, String message) {			
		int userNumber;		
		do {
			System.out.println(message);					
			while (!scan.hasNextInt()) {				
				scan.next();
			}			
			userNumber = scan.nextInt();
		} while (!TrainLogic.findByNumber(depo, userNumber));		
		return userNumber;		
	}
}
