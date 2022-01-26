package by.htp.algorithmization_2.one_dimensional_array;

public class Task03 {
	
	// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.	

	public static void main(String[] args) {				
		double[] array = new double[] {0.9, 0, 2.8, -5.1, -3.2, 2.7, 1.4, 7.5, 9.5, 11.3};		
		for (int i = 0; i < array.length; i++) {	        
	        System.out.println(array[i]);
	    	}		
		int negativeCounter = 0;
		int positiveCounter = 0;
		int zeroCounter = 0;
		for (int i = 0; i < array.length; i++) {			
			if (array[i] < 0.0) {				
				negativeCounter++;				
			} else if (array[i] > 0.0) {				
				positiveCounter++;				
			} else {
				zeroCounter++;
			}
		}		
		System.out.println("Отрицательных элементов = " + negativeCounter);		
		System.out.println("Положительных элементов = " + positiveCounter);	
		System.out.println("Нулевых элементов = " + zeroCounter);
	}
}
