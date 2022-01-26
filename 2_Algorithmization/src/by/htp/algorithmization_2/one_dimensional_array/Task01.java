package by.htp.algorithmization_2.one_dimensional_array;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	
	// В массив A[N] занесены натуральные числа. Найти сумму тех элементов массива, которые кратны данному K

	public static void main(String[] args) {		
		Random rand = new Random();						
		int n;		
		n = rand.nextInt(15);
		
		int[] a = new int[n];		
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(100);			
			System.out.print(a[i] + " ");
		}
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);					
		System.out.print("\nВведи число K >> ");
		int k;
		k = scan.nextInt();
		
		if (k <= 0) {
			System.out.println("Ошибка. Число отрицательное или имеет значение 0");	
			System.out.println("Перезапусти программу");			
		} else {
			int sum = 0;		
			for (int i = 0; i < a.length; i++) {			
				if (a[i] % k == 0) {
					sum = sum + a[i];								
				}				
			}					
			System.out.println("Сумма элементов массива кратных " + k + " = " + sum);			
		}		
	}
}
