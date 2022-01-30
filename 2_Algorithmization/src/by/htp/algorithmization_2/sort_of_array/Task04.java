package by.htp.algorithmization_2.sort_of_array;

public class Task04 {
	
	/* 
	 * Дана последовательность чисел. Нужно переставить числа в порядке возрастания.
	 * Для этого сравниваются два соседних элемента. Если первый элемент больше второго, то делается перестановка.
	 * Так продолжается, пока все элементы не станут в порядке возрастания.
	 * Составить алгоритм и подсчитать перестановки.
	 */

	public static void main(String[] args) {
		int[] a = new int[] {9, 6, 3, 1, 4, 7, 8, 2};
		
		long start = System.nanoTime();
		bubbleSort(a);
		long stop = System.nanoTime();
		
		System.out.println("Отсортированный массив: ");		
		for (int element : a) {
			System.out.print(element + " ");
		}
		
		System.out.print("\nВремя выполнения алгоритма: " + (stop - start));
	}
	
	public static void bubbleSort(int[] arrayToSort) {		
		int counter = 0;		
		for (int iteration = 1; iteration < arrayToSort.length; iteration++) {			
			for (int indexToScan = arrayToSort.length - 1; indexToScan >= iteration; indexToScan--) {				
				if (arrayToSort[indexToScan - 1] > arrayToSort[indexToScan]) {
					swapElementsOfArray(arrayToSort, indexToScan);					
				}				
			}
			counter++;			
		}
		System.out.println("Количество перестановок = " + counter);		
	}
	
	public static void swapElementsOfArray(int[] array, int index) {
		int temp = array[index - 1];
		array[index - 1] = array[index];
		array[index] = temp;
	}
}
