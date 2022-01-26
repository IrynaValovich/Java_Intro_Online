package by.htp.algorithmization_2.one_dimensional_array;

import java.util.Random;

public class Task09 {
	
	/*
	 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
	 * Если таких чисел несколько, то определить наименьшее из них.
	 */

	public static void main(String[] args) {		
		Random rand = new Random();		
		int n;
		n = rand.nextInt(20);		
		int[] array = new int[n];		
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(20);
			System.out.print("[" + array[i] + "]");
		}		
		repeatedNumber(array);
	}

	
	public static int getMin(int[] inArray){ 		
		int minValue = inArray[0]; 
		for (int i = 1; i < inArray.length; i++) { 
			if (inArray[i] < minValue) {
				minValue = inArray[i];
			} 		      
		} 		
		return minValue;		
	} 
	
	public static void repeatedNumber(int[] array) {		
		int[] numbers = new int[array.length]; 
		int num = 0;
		int counter = 0; // счетчик совпадений
		int maxCounter = 0; // максимальное количество совпадений		
		
		for (int i = 0; i < array.length; i++) {
			counter = 1; 
			for (int j = i + 1; j < array.length; j++) {
				num = array[i]; // запоминаю число по которому есть повторы				
				if (array[i] == array[j] && j != i) {
					counter++; 						
				}					
			}			
			if (maxCounter <= counter && counter != 1) {
				maxCounter = counter; 				
				System.out.print("\nЧисло " + num + " повторяется " + maxCounter + " раз\n");				
				for (int k = 0; k < numbers.length; k++) {
					numbers[k] = num;					
				}				
			}			
		}		
		System.out.print("Минимальное значение среди максимально повторяющихся чисел = " + getMin(numbers));		
		return;		
	}
}	
