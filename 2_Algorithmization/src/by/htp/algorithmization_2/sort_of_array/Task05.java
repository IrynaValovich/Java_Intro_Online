package by.htp.algorithmization_2.sort_of_array;

public class Task05 {
	
	/*
	 * Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
	 * Делается это следующим образом. Пусть а1, а2, ..., аi - упорядоченная последовательность, т.е. 
	 * а1<=a2<=a3<=ai. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
	 * последовательность была тоже возрастающей. Процесс продолжается до тех пор, пока все элементы не будут 
	 * перебраны.
	 * Примечание: Место помещения очередного элемента в отсортированную часть производится с помощью 
	 * двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
	 */
	
	public static void main(String[] args) {
		int[] array = {1, 100, -6, 95, 0, 3, 99, 10, 100, 15, 2, 41, 3, 4, 9, 23};		
		
		long start = System.nanoTime();
		insertSort(array);
		long stop = System.nanoTime();
		
		System.out.println("Отсортированный массив: ");
		for (int element : array) {
			System.out.print("[" + element + "] ");
		}
		
		System.out.print("\nВремя выполнения алгоритма: " + (stop - start));
		System.out.println();	
	}
	
	public static void insertSort(int[] arrayToSort) {
		int element;
		int positionToInsert;
		for (int i = 1; i < arrayToSort.length - 1; i++) {
			element = arrayToSort[i + 1];
			positionToInsert = findByBinary(arrayToSort, i, element);
			for (int j = i + 1; j > positionToInsert; j--) {
				arrayToSort[j] = arrayToSort[j - 1];
			}
			arrayToSort[positionToInsert] = element;					
		}
	}
	
	public static int findByBinary(int[] array, int index, int element) {
		int to = index;
		int from = 0;
		
		while (from <= index) {
			to = (from + index) / 2;
			if (array[to] == element) {
				return to;
			} else if (to != 0 && array[to] > element && !(array[to - 1] < element)) {
				index = to - 1;
			} else if (array[to] < element) {
				from = to + 1;
			} else {
				break;
			}
		}
		return to;
	}
}
