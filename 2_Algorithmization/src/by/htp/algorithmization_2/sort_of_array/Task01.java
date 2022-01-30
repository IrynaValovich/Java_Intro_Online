package by.htp.algorithmization_2.sort_of_array;

public class Task01 {
	
	/* 
	 * Заданы два одномерных массива с разным числом элементов и натуральное число k.
	 * Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
	 * при этом не используя дополнительный массив. 
	 */

	public static void main(String[] args) {		
		int[] array1 = new int[]{1, 2, 3, 4, 8, 6, 4, 7};
		int[] array2 = new int[]{10, 1, 11};
		int k = 5;
		int[] result = new int[array1.length + array2.length];    

		int j = 0;
		for (int element : array1) {			
			result[j] = element;
			j++;		
		}		

		for (int element : array2) {
			result[j] = element;						
			j++;			
		}		

		int temp;
		for (int i = 0; i < array2.length; i++) {
			temp = i + k;
			int temp2 = result[temp];
			result[temp] = result[temp + array2.length];
			result[temp + array2.length] = temp2;
		}       

		System.out.println("Результирующий массив: ");        
		for (int element : result) {
		    System.out.print("[" + element + "] ");
		}
		System.out.println();       
    }	
}
