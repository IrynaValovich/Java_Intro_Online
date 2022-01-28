package by.htp.algorithmization_2.multidim_array;

import java.util.Random;

public class Task13 {
	
	// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

	public static void main(String[] args) {
		int str = 3;
		int column = 4;		
		int[][] matrix = createMatrix(str, column);
		
	    System.out.println("Дана матрица: ");	    
	    printMatrix(matrix);	    
	    
	    System.out.println("Столбцы по возрастанию: ");
	    sortAscending(matrix, str, column);
	    printMatrix(matrix);
	    
	    System.out.println("Столбцы по убыванию: ");
	    sortDescending(matrix, str, column);
	    printMatrix(matrix);	    
	}
	
	public static void sortDescending(int[][] matrix, int str, int column) {
		for (int k = 0; k < column; k++) {
			for (int j = k; j < column; j++) {
				for (int i = 0; i < str - 1; i++) {
					if (matrix[i][k] < matrix[i + 1][k]) {
						int temp = matrix[i][k];
						matrix[i][k] = matrix[i + 1][k];
						matrix[i + 1][k] = temp;
					}
				}
			}
		}		
	}
	
	public static void sortAscending(int[][] matrix, int str, int column) {		
		for (int k = 0; k < column; k++) {
			for (int j = k; j < column; j++) {
				for (int i = 0; i < str - 1; i++) {
					if (matrix[i][k] > matrix[i + 1][k]) {
						int temp = matrix[i][k];
						matrix[i][k] = matrix[i + 1][k];
						matrix[i + 1][k] = temp;
					}
				}
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "] ");
			}
			System.out.println();
		}		
	}
	
	
	public static int[][] createMatrix(int str, int column) {		
		Random rand = new Random();
		int[][] matrix = new int[str][column];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = rand.nextInt(16);												
			}						
		}
		return matrix;
	}	
}		

