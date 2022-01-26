package by.htp.algorithmization_2.one_dimensional_array;

public class Task02 {
	
	/*
	 * Дана последовательность действительных чисел а1, а2, а3 и т.д. до n. Заменить все ее члены,
	 * бОльшие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {		
		double array[] = new double[] {0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5};		
		double z = 2;
		int counter = 0;		
		for (int i = 0; i < array.length; i++) {			
			if (array[i] > z) {
				array[i] = z;
				counter++;				
			}			
		}		
		System.out.println("Количество замен = " + counter);
	}	
}
