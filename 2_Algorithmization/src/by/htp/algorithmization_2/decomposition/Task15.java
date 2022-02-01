package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task15 {
	
	/*
	 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность.
	 * Для решения задачи использовать декомпозицию.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		int n = getNFromUser("Введи n-значность >> ");		
		
		long start = System.currentTimeMillis();
		findNumbers(n);
		long stop = System.currentTimeMillis();	
		System.out.println("Время выполнения программы: " + (stop - start));
	}
	
	private static int enterFromConsole(String message) {					
		System.out.print(message);					
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}					
		return scan.nextInt();					
	}
	
	private static int getNFromUser(String message) {
		int N;
		do {
			N = enterFromConsole(message);			
		} while (N <= 0);			
		return N;
	}
	
	private static void findNumbers(int n) {		
		int temp = n - 1;
        int val = (int) Math.pow(10, temp);
        for (int i = val; i < val * 10; i++) {        	
            int counter = 0;
            for (int j = 0; j < n; j++) {
                int rightDigit = (int) (i / Math.pow(10, j - 1)) % 10;
                int leftDigit = (int) (i / Math.pow(10, j)) % 10;
                if (leftDigit < rightDigit) {
                    counter++;
                }
                if (counter == temp) {
                    System.out.print(i + " ");
                }                
            }            
        }
        System.out.println();
    }
}
