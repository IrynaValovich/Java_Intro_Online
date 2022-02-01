package by.htp.algorithmization_2.decomposition;

public class Task02 {
	
	// Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел
	
	public static void main(String[] args) {		
		int number1 = 9;
		int number2 = 12;
		int number3 = 36;
		int number4 = 63;
		int[] array = {number1, number2, number3, number4};
		
		int result;		
		long start = System.nanoTime();
		result = findGCDForFourNumbers(array);	
		long stop = System.nanoTime();		
		
		System.out.println("НОД четырех чисел: " + number1 + ", " + number2 + ", " + number3 + ", " +
		number4 + " равен " + result);
		System.out.println("Время выполнения алгоритма: " + (stop - start));				
	}
	
	private static int findGCD(int number1, int number2) {
		int result = 0;		
		for (int potentialNumber = 1; potentialNumber <= Math.max(number1, number2); potentialNumber++) {
			if (number1 % potentialNumber == 0 && number2 % potentialNumber == 0) {
				result = potentialNumber;
			}
		}
		return result;		
	}	
	
	private static int findGCDForFourNumbers(int[] arrayFromFourNumbers) {
		int gcdArray = arrayFromFourNumbers[0];
		for (int i = 1; i < arrayFromFourNumbers.length; i++) {
			gcdArray = findGCD(gcdArray, arrayFromFourNumbers[i]);
		}
		return gcdArray;		
	}
}
