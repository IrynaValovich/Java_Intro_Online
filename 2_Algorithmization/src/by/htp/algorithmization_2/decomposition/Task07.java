package by.htp.algorithmization_2.decomposition;

public class Task07 {
	
	// Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

		public static void main(String[] args) {			
			int firstNumber = 1;
			int lastNumber = 9;			
			
			long start = System.nanoTime();
			int sum = findSumFactOdd(firstNumber, lastNumber);
			long stop = System.nanoTime();			
			
			System.out.println("Сумма факториалов нечетных чисел в диапазоне от " + firstNumber + " до " + lastNumber + " = " + sum);
			System.out.println("Время выполнения алгоритма: " + (stop - start));			
		}	
		
		private static int findSumFactOdd(int firstnumber, int lastNumber) {			
			int sum = 0;			
			int factorial = 1;			
			for (int i = 1; i <= lastNumber; i = i + 2) {				
				for (int j = 1; j <= i; j++) {
					factorial = factorial * j;
				}				
				sum = factorial + sum;
				factorial = 1;				
			}			
			return sum;			
		}		
	}
