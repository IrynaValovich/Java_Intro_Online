package by.htp.algorithmization_2.multidim_array;

public class Task16 {
	
	/* * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
	 * 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
	 * равны между собой. Построить такой квадрат.
	 * Пример магического квадрата порядка 3:
	 * 			6	1	8
	 * 			7	5	3
	 * 			2	9	4
	 */
	
	public static void main(String[] args) {		
		int n = 5;
		int[][] matrix = new int[n][n];
		magicSquare(matrix, n);
		printMagicSquare(matrix);		
	}	
	
	public static void magicSquare(int[][] matrix, int n) {		
        int i = 0;
        int j = n / 2;
        for (int current = 1; current <= n * n; current++) {
            matrix[i][j] = current;
            if (current % n == 0) { // если текущее число кратно n, спуск вниз
                i++;
            } else {// иначе подъем и влево
                i--;
                j++;
                if (i < 0) {
                	i = n - 1;
                }                
                if (j > n-1) {
                	j = 0;
                }
            }
        }
    }	
	
	public static void printMagicSquare(int[][] matrix) {		
		System.out.println("Магический квадрат: ");		
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }	
}
