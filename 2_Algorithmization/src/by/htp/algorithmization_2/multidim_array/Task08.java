package by.htp.algorithmization_2.multidim_array;

import java.util.Random;
import java.util.Scanner;

public class Task08 {
	
	// В числовой матрице поменять местами два любых столбца. Номера столбцов вводит пользователь с клавиатуры
	
	public static void main(String[] args) {		
		int str = 4;
		int column = 10;						
		
		System.out.println("Исходная матрица: ");
		int[][] matrix = fillMatrix(str, column);
		
		int column1;
		column1 = enterFromConsole("Введите номер столбца для замены >> ") - 1;
		
		int column2;
		column2 = enterFromConsole("Введите номер столбца для замены >> ") - 1;
			
		swapMatrix(matrix, str, column1, column2);
		
		System.out.println("Матрица после замены столбцов: ");			
		printChangedMatrix(matrix, str, column);
	}
	
	public static int[][] fillMatrix(int str, int column) {		
		Random rand = new Random();
		int[][] fillMatrix = new int[str][column];		
		for (int i = 0; i < str; ++i) {			
			for (int j = 0; j < column; ++j) {
				fillMatrix[i][j] = rand.nextInt(50);
				System.out.print(fillMatrix[i][j] + " ");
			}			
			System.out.println();			
		}		
		return fillMatrix;		
	}	
	
	public static void swapMatrix(int[][] originalMatrix, int str, int col1, int col2) {
	    	for (int i = 0; i < str; i++) {
		      	int temp = originalMatrix[i][col1];
		      	originalMatrix[i][col1] = originalMatrix[i][col2];
		      	originalMatrix[i][col2] = temp;
		}	
	}	
	
	public static void printChangedMatrix(int[][] originalMatrix, int str, int column) {		
		int[][] newMatrix = originalMatrix.clone();		
		for (int i = 0; i < str; i++) {
		      	for (int j = 0; j < column; j++) {
		        	System.out.print(newMatrix[i][j]+" "); 
			}
			System.out.println();
		}		
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
