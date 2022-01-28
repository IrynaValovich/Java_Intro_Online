package by.htp.algorithmization_2.multidim_array;

public class Task09 {
	
	/*
	 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
	 * Определить, какой столбец содержит максимальную сумму.
	 */

	public static void main(String[] args) {		
		int[][] matrix = {
				{10, 2, 3, 11, 6, 22},
				{10, 6, 7, 12, 1, 15},
				{20, 8, 1, 10, 4, 10},
				{11, 3, 6, 15, 2, 10}				
		};
		
		int[] summa = sumColumn(matrix);
	    	for(int i = 0; i < summa.length; i++) {
	        	System.out.println("Сумма элементов столбца " + (i+1) + " = " + summa[i]);
	    	}	    
	    	findMaxSum(summa);
	}
	
	public static int[] sumColumn(int[][] matrix) {		
		int[] sum;
		sum = new int[matrix[0].length];		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum[j] += matrix[i][j];
			}
		}		
		return sum;
	}
	
	public static void findMaxSum(int[] sumMas) {		
		int i;		
		int max = 0;
		for (i = 0; i < sumMas.length; i++) {
		    	if (sumMas[i] > max) {
				max = sumMas[i];
		    	}            
		}
		System.out.print("Столбец " + i + " содержит максимальную сумму " + max);
		System.out.println();        
	}	
}
