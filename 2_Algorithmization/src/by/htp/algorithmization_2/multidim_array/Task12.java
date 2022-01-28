package by.htp.algorithmization_2.multidim_array;

import java.util.Random;

public class Task12 {
	
	// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

	public static void main(String[] args) {
		int str = 10;
		int column = 10;
		int[][] matrix = new int[str][column];
		
		System.out.println("Дана матрица: ");
		createMatrix(matrix);
		
		System.out.println("Строки по возрастанию: ");
		sortAscending(matrix);
		
		System.out.println("Строки по убыванию: ");
		sortDescending(matrix);
	}
	
	public static void createMatrix(int[][] matrix) {		
		Random rand = new Random();		
		int i;
		int j;		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(16);
				System.out.print("[" + matrix[i][j] + "] ");								
			}
			System.out.println();			
		}		
	}
	
	public static void sortAscending(int[][] matrix) {		
		int i;
		int j;		
		int temp;		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				for (int k = j + 1; k < matrix.length; k++) {
					if (matrix[i][j] > matrix[i][k]) {
						temp = matrix[i][j];
						matrix[i][j] = matrix[i][k];
						matrix[i][k] = temp;
					}
				}				
				System.out.print("[" + matrix[i][j] + "] ");
			}
			System.out.println();
		}
	}
	
	public static void sortDescending(int[][] matrix) {		
		int i;
		int j;		
		int temp;		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				for (int k = j + 1; k < matrix.length; k++) {
					if (matrix[i][j] < matrix[i][k]) {
						temp = matrix[i][j];
						matrix[i][j] = matrix[i][k];
						matrix[i][k] = temp;
					}
				}				
				System.out.print("[" + matrix[i][j] + "] ");
			}
			System.out.println();
		}		
	}
}
