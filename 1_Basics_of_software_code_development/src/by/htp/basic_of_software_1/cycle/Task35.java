package by.htp.basic_of_software_1.cycle;

public class Task35 {
	
	/*
	 * Два двузначных числа, записанных одно за другим, образуют четырехзначное число,
	 * которое делится на их произведение. Найти эти числа
	 */

	public static void main(String[] args) {		
		int n1;
		int n2;
		int n4;		
		for (n1 = 10; n1 < 100; n1++) {			
			for (n2 = 10; n2 < 100; n2++) {				
				n4 = (100 * n1) + n2;				
				if (n4 % (n1 * n2) == 0) {					
					System.out.println("Двузначные числа: " + n1 + ", " + n2);					
					System.out.println("Образуют четырехзначное число: " + n4 + "");					
				}				
			}			
		}		
	}
}
