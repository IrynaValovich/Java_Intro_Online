package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task05 {
	
	/*
	 * Составить программу , которая в массиве A[N] находит второе по величине число. Вывести на печать число, 
	 * которое меньше максимального элемента массива, но больше всех остальных элементов.
	 */
	
	private static Scanner scan = new Scanner(System.in);	

	public static void main(String[] args) {		
		int n;		
		n = getAmountNumbersFromUser("Введи количество чисел, которое ты хочешь поместить в массив >> ");
		
		int array[] = new int[n];		
		for (int i = 0; i < array.length; i++){
	        array[i] = enterFromConsole("Введи целое число >> ");		        	
	    }		
		System.out.println("Второе по величине число в массиве = " + getSecondMax(array));
	}
	
	private static int enterFromConsole(String message) {			
		System.out.print(message);			
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}			
		return scan.nextInt();			
	}
	
	private static int getAmountNumbersFromUser(String message) {
		int amount;
		do {
			amount = enterFromConsole(message);			
		} while (amount <= 2);			
		return amount;
	}
	
	private static int getSecondMax(int[] array) {		
		int secondMax;
		int max;
		
		if (array[0] > array[1]) {
			max = array[0];
			secondMax = array[1];
		} else {
			max = array[1];
			secondMax = array[0];
		}
		
		for (int i = 2; i < array.length; i++) {
			if (array[i] <= max && array[i] > secondMax) {
				secondMax = array[i];				
			} else if (array[i] > max){				
				secondMax = max;
				max = array[i];
			}			
		}		
		return secondMax;
	}	
}
