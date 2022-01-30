package by.htp.algorithmization_2.sort_of_array;

import java.util.Arrays;

public class Task06 {
	
	/*
	 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
	 * Делается это так: сравниваются два соседних элемента ai и ai+1. Если ai<=ai+1, то продвигаются
	 * на один элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.
	 * Составить алгоритм такой сортировки. 
	 */
	
	/*
	 * В условии задачи описан алгоритм гномьей сортировки, а заголовок указывает на сортировку Шелла. Поэтому задача решена двумя 
	 * способами: гномья сортировка и классический вариант сортировки Шелла.
	 */

	public static void main(String[] args) {		
		double[] array = new double[] {0.2, 2, 0.3, 1, 0.4, 0.8, 0.5, 0.6, 0.9};
		
		System.out.println("Отсортированный массив (гномья сортировка): ");
		long startGnome = System.nanoTime();
		gnomeSort(array);
		long stopGnome = System.nanoTime();
		printArray(array);
		System.out.print("\nВремя выполнения алгоритма: " + (stopGnome - startGnome));
		System.out.println();
		
		System.out.println("\nОтсортированный массив (сортировка Шелла): ");
		long startShell = System.nanoTime();		
		shellSort(array);
		long stopShell = System.nanoTime();		
		printArray(array);	
		System.out.print("\nВремя выполнения алгоритма: " + (stopShell - startShell));
		System.out.println();		
	}
	
	public static void gnomeSort(double[] arrayToSort) {		
		int referenceIndex = 0;
		int i = 1;		
		
		while (referenceIndex < arrayToSort.length - 1) {
			if (arrayToSort[referenceIndex] <= arrayToSort[referenceIndex + 1]) {
				referenceIndex = i;
				i += 1;
			} else {
				double temp = arrayToSort[referenceIndex];
				arrayToSort[referenceIndex] = arrayToSort[referenceIndex + 1];
				arrayToSort[referenceIndex + 1] = temp;
				referenceIndex = referenceIndex - 1;
				if (referenceIndex < 0) {
					referenceIndex = i;
					i += 1;
				}				
			}			
		}		
	}
	
	public static void shellSort(double[] array) {
		// классический вариант сортировки Шелла устанавливает шаг в количество элементов массива / 2
		// пока шаг больше нуля выполняется проход по массиву 
		double[] arrayToSort = Arrays.copyOf(array, array.length);
		int step = arrayToSort.length / 2;
		while (step > 0) {
			for (int i = step; i < arrayToSort.length; i++) {
				for (int j = i; j >= step && arrayToSort[j] < arrayToSort[j - step]; j -= step) {
					double temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j - step];
					arrayToSort[j - step] = temp;					
				}
			}
			step = step / 2;
		}
	}
	
	public static void printArray(double[] array) {
		for (double element : array) {
			System.out.print(element + " ");
		}
	}
}
