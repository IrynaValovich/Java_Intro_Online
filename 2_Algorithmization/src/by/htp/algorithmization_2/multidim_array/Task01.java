package by.htp.algorithmization_2.multidim_array;

public class Task01 {
	
	// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
	
	public static void main(String[] args) {		
		int[][] matrix = {
				{6, 10, 100, 1, 12, 68, 100},
				{8, 20, 120, 4, 10, 10, 35},
				{1, 15, 111, 3, 17, 22, 110},
				{3, 9, 99, 100, 18, 15, 99}				
		};
		
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < matrix.length; i++) {			
			for (int j = 0; j < matrix[i].length; j++) {				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}			
		
		System.out.println("Нечетные столбцы матрицы, у которых первый элемент больше последнего: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j += 2) {
				if (matrix[0][j] > matrix[matrix.length - 1][j]) {
					System.out.print(matrix[i][j] + " ");
				}				
			}
			System.out.println();
		}		
	}
}
