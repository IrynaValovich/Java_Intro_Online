package by.htp.algorithmization_2.decomposition;

public class Task12 {
	
	/*
	 * Даны натуральные числа K и N. Написать метод (методы) формирования массива A, элементами которого являются числа, 
	 * сумма цифр которых равна K и которые не больше N.
	 */	

	public static void main(String[] args) {		
		int k = 8;
		int n = 60;		
		
		long start = System.nanoTime();
		int[] array = createArray(k, n);
		long stop = System.nanoTime();		
		
		printResultArray(array);
		System.out.println("Время выполнения алгоритма: " + (stop - start));		
	}	
	
	private static int findSumOfDigits(int number) {
		int sum = 0;
		while(number != 0) {
			sum += (number % 10);
			number /= 10;
		}
		return sum;
	}
	
	private static int[] createArray(int k, int n) {
		int[] arrayToCreate = new int[k];
		for (int i = 0; i < arrayToCreate.length; i++) {
			boolean isPossible = false;
			while (!isPossible) {
				int value = (int) (Math.random() * n + 1);
				if (findSumOfDigits(value) == k) {
					arrayToCreate[i] = value;
					isPossible = true;
				} 
			}			
		}
		return arrayToCreate;
	}
	
	private static void printResultArray(int[] arrayToPrint) {
		for (int element : arrayToPrint) {
			System.out.print("[" + element + "] ");
		}
		System.out.println();
	}
}
