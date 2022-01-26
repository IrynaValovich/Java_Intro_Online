package by.htp.algorithmization_2.one_dimensional_array;

import java.util.Scanner;

public class Task04 {
	
	// Даны действительные числа a1, a2, a3 и т.д. Поменять местами наибольший и наименьший элементы
	
	public static void main(String[] args) {		
		int size = 10;		
		double[] num = new double [size];

		System.out.println("Введи " + size + " действительных чисел ");	
		for (int i = 0; i < num.length; i++) {
			num[i] = enterNumber(" >> ");
		}
		
		System.out.println("Исходный массив: ");		
		for (int i = 0; i < size; i++) {			
			System.out.print("[" + num[i] + "]");
		}
		
		double min = num[0];
		int iMin = 0;
		
		double max = num[0];
		int iMax = 0;		
		for (int i = 1; i < num.length; i++) {			
			if (num[i] > max) {
				max = num[i];
				iMax = i;
			}			
			if (num[i] < min) {
				min = num[i];
				iMin = i;
			}			
		}		
		num[iMin] = max;
		num[iMax] = min;
		
		System.out.println("\nИзмененный массив: ");
		for (int i = 0; i < num.length; i++) {
			 System.out.print("[" + num[i] + "]");
		}		
	}
	
	public static double enterNumber(String message) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);					
		System.out.print(message);					
		while(!scan.hasNextDouble()) {
			scan.next();
			System.out.print(message);
		}					
		return scan.nextDouble();					
	}
}
