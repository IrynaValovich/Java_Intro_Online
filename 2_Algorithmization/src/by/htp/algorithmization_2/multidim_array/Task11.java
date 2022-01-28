package by.htp.algorithmization_2.multidim_array;

import java.util.Random;

public class Task11 {
	
	/*
	 * Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
	 * в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {		
		int str = 10;
		int column = 20;
		int[][] matrix = new int[str][column];
		
		System.out.println("Дана матрица: ");
		fillMatrix(matrix);	
		
		findMaxFive(matrix);
	}
	
	public static void fillMatrix(int[][] matrix) {		
		Random rand = new Random();		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(16);
				System.out.print("[" + matrix[i][j] + "] ");								
			}
			System.out.println();			
		}		
	}
	
	public static void findMaxFive(int[][] matrix) {		
		for (int i = 0; i < matrix.length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 5) {
					counter++;
				}
			}
			if (counter >= 3) {
				System.out.print("В строке " + (i + 1) + " число 5 повторяется 3 или более раз" + "\r");
			} 
		}		
		System.out.println();
	}
}
