package by.htp.algorithmization_2.multidim_array;

import java.util.Random;

public class Task14 {
	
	/* * Сформировать случайную матрицу mxn, состоящую из нулей и единиц, 
	 * причем в каждом столбце число единиц равно номеру столбца.
	 */

	public static void main(String[] args) {		
		Random rand = new Random();		
		
		int m;
		int n;		
		m = rand.nextInt(15) + 2;
		n = rand.nextInt(10) + 1;
		
		int[][] matrix = new int[m][n];
		
		if (m >= n) {
			formMatrix(matrix, m, n);
		} else {
			System.out.println("Невозможно выполнить условие задачи. Перезапусти программу");
		}
	}	
	
	public static void formMatrix(int[][] matrix, int str, int column) {		
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = 0;
				if (i < column && i <= j) {
					for (int x = i; x >= 0; x--) {
						matrix[x][j] = 1;						
					}
				}
				System.out.print("[" + matrix[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
