package by.htp.algorithmization_2.multidim_array;

import java.util.Random;

public class Task15 {
	
	// Найдите наибольший элемент матрицы и замените все нечетные элементы на него

	public static void main(String[] args) {		
		Random rand = new Random();
		
		int str = 6;
		int column = 5;		
		System.out.print("Исходная матрица " + "\r");		
		int[][] matrix = new int[str][column];		
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = rand.nextInt(30);
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println();
		}
		
		int maxVal;
		maxVal = getMaxVal(matrix);
		System.out.println("Максимальное значение матрицы " + maxVal);
		
		System.out.println("Матрица после замены значений " + "\r");		
		changeMaxVal(matrix, maxVal);
	}
	
	public static int getMaxVal(int[][] matrix) {		
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) { 
		    for(int j = 0; j < matrix[i].length; j++) {
			if (max < matrix[i][j]){
			    max = matrix[i][j];
			} 
		    } 
		}
		return max;
    	}
	
	public static void changeMaxVal(int[][] matrix, int max) {        
		for (int i = 0; i < matrix.length; i++) { 
		    for(int j = 0; j < matrix[i].length; j++) {
			if (matrix[i][j] % 2 != 0) {
			    matrix[i][j] = max;
			}
			System.out.print("[" + matrix[i][j] + "] "); 
		    }
		    System.out.println(); 
		}       
	}
}
