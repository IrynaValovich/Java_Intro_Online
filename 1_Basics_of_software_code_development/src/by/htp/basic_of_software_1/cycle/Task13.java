package by.htp.basic_of_software_1.cycle;

public class Task13 {
	
	// Составить таблицу значений функции y=5-x^2/2 на отрезке [-5;5] с шагом 0.5

	public static void main(String[] args) {		
		double a = -5;
		double b = 5;
		double h = 0.5;
		
		double x;
		double y;		
		for (x = a; x <= b; x = x + h) {			
			y = 5 - (x * x / 2);			
			System.out.println("x = " + x + " y = " + y);			
		}	
	}
}
