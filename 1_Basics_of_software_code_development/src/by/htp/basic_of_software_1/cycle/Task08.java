package by.htp.basic_of_software_1.cycle;

public class Task08 {
	
	// Вычислить значения функции на отрезке [a,b] с шагом h. y = {(x+c)*2, если x = 2, (x-c)+6, если x!=15

	public static void main(String[] args) {		
		int a = -3;
		int b = 17;
		int h = 1;
		int c = 4;
		int x;
		int y;		
		for (x = a; x <= b; x = x + h) {			
			if (x != 15) {				
				y = (x - c) + 6;
				System.out.println("При x = " + x + ", y = " + y);
				if (x == 2) {				
					y = (x + c) * 2;
					System.out.println("При x = " + x + ", y = " + y);
				}				
			} 								
		}			
	}	
}
