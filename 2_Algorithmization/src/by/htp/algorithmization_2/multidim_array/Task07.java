package by.htp.algorithmization_2.multidim_array;

import java.util.Scanner;

public class Task07 {
	
	/* 
	 * Сформировать квадратную матрицу порядка N по правилу A[I,J]=sin((I^2-J^2)/N) и подсчитать количество
	 * положительных элементов в ней 				  
	 */

	public static void main(String[] args) {		
		int n;		
		n = enterNumber("Введи число строк ИЛИ столбцов матрицы >> ");	
		
		if (n >= 2) {
			System.out.println("Дана матрица: ");
			double[][] matrix = formMatrix(n);
			printMatrix(matrix);	
			positiveElementsCounter(matrix);	
		} else {
			System.out.println("Что-то пошло не так. Перезагрузи программу ");
		}
	}	
	
	public static double[][] formMatrix(int number) {		
		double[][] formMatrix = new double[number][number];				
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				formMatrix[i][j] = Math.sin((i * i - j * j) / number);
			}					
		}		
		return formMatrix;		
	}
	
	public static void positiveElementsCounter(double[][] matrix) {		
		int counter = 0;		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					counter++;
				}
			}
		}		
		System.out.println("Положительных элементов = " + counter);		
	}
	
	public static void printMatrix(double[][] matrix) {			
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
