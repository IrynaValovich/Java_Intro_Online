package by.htp.algorithmization_2.multidim_array;

import java.util.Scanner;

public class Task06 {
	
	/* 
	 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное) 
	 * 
	 * 				 1	  1	   1 	...		1	1	1
	 * 				 0	  1	   1 	...		1	1	0
	 * 				 0	  0	   1	... 	1	0	0 				
	 * 				 .	  .	   .	. 		.	.	.
	 * 				 .	  .	   .	 .		.	.	.
	 * 				 .	  .	   .	  .		.	.	.
	 * 				 0	  1    1	...		1	1	0
	 * 				 1	  1	   1	...		1	1	1  
	 */

	public static void main(String[] args) {		
		int n;		
		n = enterNumber("Введи число строк ИЛИ столбцов матрицы >> ");	
		
		if (n % 2 == 0 && n >= 2) {
			System.out.println("Дана матрица: ");
			int[][] matrix = fillMatrix(n);
			printMatrix(matrix);	
		} else {
			System.out.println("Число отрицательное или нечетное. Перезагрузи программу ");
		}
	}	
	
	public static int[][] fillMatrix(int size) {		
		int[][] fillMatrix = new int[size][size];			
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j >= i && (j <= size - i - 1) || j <= i && j >= size - i - 1) {
					fillMatrix[i][j] = 1;
				} else {
					fillMatrix[i][j] = 0;
				}
			}					
		}		
		return fillMatrix;		
	}
	
	public static void printMatrix(int[][] matrix) {		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "] ");
			}			
			System.out.println();   
		}	    
	}
	
	public static int enterNumber(String message) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
					
		System.out.print(message);					
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}				
		return scan.nextInt();					
	}
}
