package by.htp.algorithmization_2.sort_of_array;

public class Task07 {
	
	/*
	 * Даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm. 
	 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm
	 * в первую последовательность так, чтобы новая последовательность оставалась возрастающей. 
	 */

	public static void main(String[] args) {
		double[] a = {0.1, 0.3, 0.5, 0.7};
		double[] b = {0, 0.2, 0.4, 0.8};
		
		long start = System.nanoTime();
		printInsertPosition(a, b);
		long stop = System.nanoTime();
		System.out.print("\nВремя выполнения алгоритма: " + (stop - start));
		System.out.println();
	}

	private static void printInsertPosition(double [] array1, double [] array2) {		
		for (int i = 0, j = 0; i < array1.length && j < array2.length; i++, j++) {
			if (array2[j] < array1[i]) {
        			System.out.print("\nзначение " + array2[j] + " расположится перед " + i + "-ой ячейкой в первом массиве");
        		} else if (array2[j] > array1[i]) {
        			System.out.print("\nзначение " + array2[j] + " расположится после " + i + "-ой ячейки в первом массиве"); 
        		}            
		}		
		System.out.println();    
	}
}
