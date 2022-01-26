package by.htp.algorithmization_2.one_dimensional_array;

public class Task05 {
	
	// Даны целые числа a1, a2, ..., an. Вывести на печать только те числа, для которых ai > i
	
	public static void main(String[] args) {				
		int[] a = new int[] {0, 2, 1, 5, 9, 3, 4, 6, 10, 9};			
		for (int i = 0; i < a.length; i++) {			
			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}			
		}
	}
}
