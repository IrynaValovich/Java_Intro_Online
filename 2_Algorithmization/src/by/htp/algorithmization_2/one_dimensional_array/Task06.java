package by.htp.algorithmization_2.one_dimensional_array;

public class Task06 {
	
	/*
	 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
	 * являются простыми числами. 
	 */
	
	public static void main(String[] args) {		
		double[] array = new double[] {0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5};				
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {			
			System.out.print("[" + array[i] + "] ");
		}
		
		System.out.println("\nСумма цифр с простыми порядковыми номерами = ");		
		double summa = 0;
		for (int i = 0; i < array.length; i++) {			
			if (isSimple(i)) {				
				summa = array[i-1] + summa; 				
			}			
		}		
		System.out.println(summa);			
	}
	
	public static boolean isSimple(int x) {		
		if (x < 2) {
			return false;
		}		
		for (int i = 2; i <= x / 2; i++) {			
			if (x % i == 0) {
				return false;
			}			
		}		
		return true;
	}	
}
