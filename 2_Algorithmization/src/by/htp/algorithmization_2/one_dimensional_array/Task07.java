package by.htp.algorithmization_2.one_dimensional_array;

public class Task07 {
	
	// Даны действительный числа a1, a2, ..., an. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1)

	public static void main(String[] args) {		
		double[] array = new double[] {0.1, 0.2, 0.5, 1.1, 0.4, 0.06, 0.07};		
		System.out.println("Исходный массив: ");
		for (int i = 0; i < array.length; i++) {			
			System.out.print("[" + array[i] + "]");
		}

		double maxSum;		
		maxSum = array[0] + array[array.length - 1];		
		for (int i = 1; i < array.length / 2; i++) {			
			if ((array[i] + array[array.length - i - 1]) > maxSum) {
				maxSum = array[i] + array[array.length - i - 1];
		    }
		}		    
		System.out.print("\nmax чисел = " + maxSum);
	}
}
