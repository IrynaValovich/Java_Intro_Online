package by.htp.algorithmization_2.multidim_array;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
	
	// Дана матрица. Вывести k-ю строку и p-й столбец матрицы
	
	public static void main(String[] args) {		
		int str = 8;
		int column = 10;		
		System.out.println("Дана матрица: ");
		int[][] matrix = fillMatrix(str, column);	
		
		printStrCol(matrix);
	}
	
	public static int[][] fillMatrix(int str, int column) {					
		Random rand = new Random();
		int[][] fillMatrix = new int[str][column];		
		for (int i = 0; i < str; ++i) {			
			for (int j = 0; j < column; ++j) {
				fillMatrix[i][j] = rand.nextInt(50);
				System.out.print("[" + fillMatrix[i][j] + "] ");
			}			
			System.out.println();			
		}		
		return fillMatrix;		
	}
	
	public static void printStrCol(int[][] matrix) {		
		int i = 0;
		int k;
		int p;		
		int j;
		
		k = enterFromConsole("Введите порядковый номер строки >> ");
		for (j = 0; j < matrix[i].length; j++) {
		      System.out.print(matrix[k-1][j] + " ");
		}
		System.out.println();
		
		
		p = enterFromConsole("Введите порядковый номер столбца >> ");		
		for (i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][p-1] + " ");
		}
		System.out.println();	    
	}	
	
	public static int enterFromConsole(String message) {		
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
