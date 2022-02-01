package by.htp.algorithmization_2.decomposition;

public class Task11 {
	
	// Написать метод (методы), определяющий, в каком из двух чисел цифр больше.
	
	public static void main(String[] args) {		
		int number1 = 1648752;
		int number2 = 1254;		
		
		long start = System.nanoTime();
		isLonger(number1, number2);
		long stop = System.nanoTime();		
		
		System.out.println("Время выполнения программы: " + (stop - start));		
	}	
	
	private static int countDigitsInNumber(int numberToCount) {		
		int counter = 1;		
		while (numberToCount >= 10) {		
			numberToCount = numberToCount / 10;
			counter++;
		}		
		return counter;
	}
	
	//метод сравнения счетчиков
	private static void isLonger(int number1, int number2) {		
		int counterOfNumber1 = countDigitsInNumber(number1);
		int counterOfNumber2 = countDigitsInNumber(number2);		
		if (counterOfNumber1 > counterOfNumber2) {
			System.out.println("В первом числе цифр больше, чем во втором");
		} else if (counterOfNumber1 == counterOfNumber2) {
			System.out.println("В числах одинаковое количество цифр");
		} else {
			System.out.println("Во втором числе цифр больше, чем в первом");
		}		
		return;			
	}
}
