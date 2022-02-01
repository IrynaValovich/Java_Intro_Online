package by.htp.algorithmization_2.decomposition;

public class Task13 {
	
	/*
	 * Два простых числа называются близнецами, если они отличаются друг от друга на 2 (например, 41 и 43).
	 * Найти и напечатать все пары близнецов из отрезка [n,2n], где n - заданное натуральное число больше 2.
	 * Для решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {		
		int n = 7;		
		int n2 = 2 * n;			
		System.out.println("Найдены пары чисел-близнецов: ");		
		
		long start = System.nanoTime();
		findTwins(n, n2);
		long stop = System.nanoTime();		
		
		System.out.println("Время выполнения программы: " + (stop - start));		
	}
	
	private static boolean isSimple(int n) {
		if (n <= 1) return false;
		if (n == 2) return true;
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
		    if (n % i == 0) {
			return false;
		    }
		}
		return true;
    	}
	
	private static void findTwins(int firstNumber, int secondNumber) {
		for (int i = firstNumber; i + 2 < secondNumber; i++) {
			if (isSimple(i) && isSimple(i + 2)) {
				System.out.print(i + ", " + (i+2) + " \r");
			}
		}
		System.out.println();
	}
}
