package by.htp.algorithmization_2.one_dimensional_array;

public class Task08 {
	
	/*
	 * Дана последовательность целых чисел a1, a2, ... , an. Образовать новую последовательность,
	 * выбросив из исходной те члены, которые равны min(a1, a2, ... , an).
	 */
	
	public static void main(String[] args) {			
		int[] a = new int[] {-2, 3, 6, -1, 15, 1, 28, 36, 45};		
		
		System.out.println("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {			
			System.out.print("[" + a[i] + "]");
		}
		
		int minElement = Integer.MAX_VALUE;
		int counterMin = 0;
		for (int x : a) {
			minElement = Math.min(minElement, x);
			if (x == minElement) {
				counterMin++;
			}
		}
		
		System.out.println("\nНовый массив: ");				
		int[] newA = new int[a.length - counterMin];
		int iArr = 0;
        for (int x : a) {
            if (x != minElement) {
                newA[iArr++] = x;
                System.out.print("[" + x + "] ");
            }
        }
	}
}
