package by.htp.algorithmization_2.sort_of_array;

public class Task02 {
	
	/* 
	 * Даны две последовательности a1<=a2<=a3...<=an и b1<=b2<=b3...<=bm.
	 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
	 * Примечание: Дополнительный массив не использовать. 
	 */

	public static void main(String[] args) {
		int[] a = new int[] {1, 3, 5, 7, 9, 11};
		int[] b = new int[] {0, 2, 4, 6, 8, 12};
		int[] result = new int[a.length + b.length];
		merge(a, b, result);
		
		System.out.println("Результирующий массив: ");		
		for (int element : result) {
			System.out.print(element + " ");
		}	
		System.out.println();
	}
	
	public static void merge(int[] a, int[] b, int[] result) {		
		int i = 0;
		int j = 0;
		
		for (int k = 0; k < result.length; k++) {
			if (i > a.length - 1) {
				int value = b[j];
				result[k] = value;
				j++;
			} else if (j > b.length - 1) {
				int value = a[i];
				result[k] = value;
				i++;
			} else if (a[i] < b[j]) {
				int value = a[i];
				result[k] = value;
				i++;
			} else {
				int value = b[j];
				result[k] = value;
				j++;
			}
		}		
	}
}

