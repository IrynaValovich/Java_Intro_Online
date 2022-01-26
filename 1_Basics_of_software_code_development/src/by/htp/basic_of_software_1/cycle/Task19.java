package by.htp.basic_of_software_1.cycle;

public class Task19 {
	
	/* 
	 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых >=e
	 * Общий член ряда имеет вид: an=(1/2^n)+1/3^n
	 */

	public static void main(String[] args) {		
		
		double e = 0.005;		
		int n = 9;		
		double an = 0;		
		double sum = 0;			
		for (int i = 1; i <= n; i++) {			
			an = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			System.out.println(i + " этап, значение an = " + an);
			if (Math.abs(an) >= e) {				
				sum = sum + an;					
			}			
		}		
		System.out.println("Сумма тех членов ряда, модуль которых больше или равен " + e + " составляет " + sum);
	}
}
