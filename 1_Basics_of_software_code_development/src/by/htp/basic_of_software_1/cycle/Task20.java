package by.htp.basic_of_software_1.cycle;

public class Task20 {
	
	/* 
	 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых >=e
	 * Общий член ряда имеет вид: an=1/(3n-2)(3n+1)
	 */

	public static void main(String[] args) {		
		double e = 0.5;		
		int n = 10;		
		double an = 0;		
		double sum = 0;			
		for (int i = 1; i <= n; i++) {			
			an = 1 / (3 * i - 2) * (3 * i + 1);			
			if (Math.abs(an) >= e) {				
				sum = sum + an;				
			}			
		}		
		System.out.println("Сумма тех членов ряда, модуль которых больше или равен " + e + " составляет " + sum);
	}
}
