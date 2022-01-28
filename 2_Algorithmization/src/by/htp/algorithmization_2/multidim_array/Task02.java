package by.htp.algorithmization_2.multidim_array;

public class Task02 {
	
	// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

	public static void main(String[] args) {		
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 9},
				{9, 8, 1, 2},
				{4, 3, 6, 5}				
		};		
		System.out.println("Диагональные значения: ");
		for (int i = 0; i < matrix.length; ++i) {			
			System.out.print(matrix[i][i] + " ");			
		}
		System.out.println();
	}
}
