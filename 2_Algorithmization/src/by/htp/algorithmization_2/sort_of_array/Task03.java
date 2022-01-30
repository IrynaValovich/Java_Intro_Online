package by.htp.algorithmization_2.sort_of_array;

public class Task03 {
	
	/* 
	 * Сортировка выбором. Дана последовательность чисел a1<=a2<=a3. Треубется переставить элементы так,
	 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
	 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго,
	 * эта процедура повторяется. Написать алгоритм сортировки выбором.
	 */

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};		
		
		long start = System.nanoTime();		
		choiceSort(a);
		long stop = System.nanoTime();
		
		System.out.println("Отсортированный массив: ");
		for (int element : a) {
			System.out.print("[" + element + "] ");
		}		
		System.out.print("\nВремя выполнения алгоритма: " + (stop - start));
		System.out.println();
	}
	
	public static void choiceSort(int[] arrayToSort) {
		
		// прохожу по массиву
		// ищу максимальный элемент
		// меняю местами элементы до конца массива
		
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			int indexMax = i;
			for (int indexToScan = i + 1; indexToScan < arrayToSort.length; indexToScan++) {
				if (arrayToSort[indexMax] < arrayToSort[indexToScan]) {
					indexMax = indexToScan;
				}
				swapElementsOfArray(arrayToSort, i, indexMax);				
			}						
		}		
	}
	
	public static void swapElementsOfArray(int[] array, int index1, int index2) {		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}	
}
