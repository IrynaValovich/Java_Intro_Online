package by.htp.algorithmization_2.sort_of_array;

public class Task08 {
	
	/*
	 * Даны дроби p/q. Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их
	 * в порядке возрастания.
	 */

	public static void main(String[] args) {		
		int[] p = {1, 1, 1, 6, 2, 11, 12, 12};
		int[] q = {3, 5, 8, 4, 5, 7, 5, 15};
		result(p, q);        
    	}
	
	public static int nok(int[] q) {		
		boolean isFind = false;
    	
		int max = q[0];
		for (int i = 1; i < q.length; i++) {
		    if (max < q[i]) {
			max = q[i];
		    }
		}        

		int nok = max;
		int mult = 1;
		while (!isFind) {
		    nok = max * mult;
		    isFind = true;
		    for (int i = 0; i < q.length; i++) {
			if (nok % q[i] != 0) {
			    isFind = false;
			}
		    }
		    mult++;
		}        
		return nok;
	}

    public static int[] sort(int[] arrayToSort) {    	
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            int max_index = i;

            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < arrayToSort[max_index]) {
                    max_index = j;
                }

                if (max_index != i) {
                    swapElementsOfArray(arrayToSort, i, max_index);
                }
            }
        }
        return arrayToSort;
    }
    
    public static void swapElementsOfArray(int[] array, int index, int maxIndex) {
    	int temp = array[index];
    	array[index] = array[maxIndex];
    	array[maxIndex] = temp;    	
    }
    
    public static void result(int[] p, int[] q) {    	
        int nok = nok(q);
        for (int i = 0; i < p.length; i++) {
            p[i] = nok / q[i] * p[i];
        }
        sort(p);
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + nok + "\r");
        }
        System.out.println();
    }	
}
