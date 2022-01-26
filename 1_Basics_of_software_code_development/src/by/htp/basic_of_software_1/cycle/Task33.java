package by.htp.basic_of_software_1.cycle;

public class Task33 {
	
	// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

	public static void main(String[] args) {		
		for (int i = 1000; i < 10000; i++) {			
			if (i % 10 + (i / 10) % 10 + (i / 100) % 10 + i / 1000 == 15) {				
				System.out.println(i);				
			}
		}		
	}		
}
