package by.htp.algorithmization_2.multidim_array;

public class Task10 {
	
	// Найти положительные элементы главной диагонали квадратной матрицы.

	public static void main(String[] args) {		
		int[][] matrix = {
				{1, -1, 20, -8, 6},
				{2, -2, -7, 12, 1},
				{3, -3, -4, 10, 4},
				{4, 13, -6, 10, 2},
				{5, 14, 20, 11, 8}				
		};
		
		System.out.println("Положительные элементы главной диагонали: ");		
		for (int i = 0; i < matrix.length; ++i) {			
			if (matrix[i][i] > 0) {				
				System.out.print(matrix[i][i] + " ");				
			}			
		}
	}
}
