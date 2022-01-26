package by.htp.basic_of_software_1.cycle;

public class Task18 {
	
	/* 
	 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых >=e
	 * Общий член ряда имеет вид: an=((-1)^n-1)/n
	 */

	public static void main(String[] args) {		
		double e = 0.05;		
		int n = 15;		
		double an = 0;		
		double sum = 0;			
		for (int i = 1; i <= n; i++) {			
			an = Math.pow(-1, i-1) / i;	
			System.out.println(i + " этап, значение an = " + an);
			if (Math.abs(an) >= e) {				
				sum = sum + an;											
			}				
		}
		System.out.println("Сумма тех членов ряда, модуль которых больше или равен " + e + " составляет " + sum);
	}
}
