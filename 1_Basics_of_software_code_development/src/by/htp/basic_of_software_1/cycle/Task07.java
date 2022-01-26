package by.htp.basic_of_software_1.cycle;

public class Task07 {
	
	// Вычислить значения функции на отрезке [a,b] с шагом h. y = {x, если x > 2, -x, если x<=2

	public static void main(String[] args) {
		int a = -5;
		int b = 10;
		int h = 2;
		int x;
		int y;		
		for (x = a; x <= b; x = x + h) {			
			y = (x > 2) ? x : -x;			
			System.out.println("При x = " + x + ", y = " + y);
		}		 
	}	
}
