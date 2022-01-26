package by.htp.basic_of_software_1.cycle;

public class Task37 {
	
	/* 
	 * В трехзначном числе зачеркнули старшую цифру.
	 * Полученное умножили на 7 и вывели исходное число. Найти это число.
	 */

	public static void main(String[] args) {		
		int number;		
		for (int i = 100; i < 1000; i++) {			
			number = i % 100;			
			if (i == 7 * number) {				
				System.out.println("Исходное число = " + i);				
			}			
		}	
	}
}
