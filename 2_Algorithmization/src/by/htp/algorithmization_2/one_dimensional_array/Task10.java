package by.htp.algorithmization_2.one_dimensional_array;

import java.util.Random;

public class Task10 {
	
	/*
	 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент.
	 * Примечание: Не использовать дополнительный массив и заменить вторые элементы нулями.
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
		
		System.out.println("\nМассив после сжатия: ");
		squeezeArray(array);
	}
	
	public static void squeezeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
		    if(i % 2 == 1){
			array[i] = 0;
		    }
            	System.out.print("[" + array[i] + "]");
        	}
	}
}
