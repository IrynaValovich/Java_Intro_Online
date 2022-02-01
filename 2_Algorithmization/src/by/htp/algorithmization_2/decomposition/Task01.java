package by.htp.algorithmization_2.decomposition;

public class Task01 {
	
	// Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел	 	
	
	public static void main(String[] args) {
		int number1 = 260;
		int number2 = 1060;		
		
		long startGCD = System.nanoTime();
		int gcd = findGCD(number1, number2);
		long stopGCD = System.nanoTime();		
		
		long startLCM = System.nanoTime();
		int lcm = findLCM(number1, number2);
		long stopLCM = System.nanoTime();		
		
		System.out.println("НОД чисел " + number1 + " и " + number2 + " = " + gcd);
		System.out.println("Время выполнения алгоритма: " + (stopGCD - startGCD));		
		
		System.out.println("НОК чисел " + number1 + " и " + number2 + " = " + lcm);
		System.out.println("Время выполнения алгоритма: " + (stopLCM - startLCM));		
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
	
	private static int findLCM(int number1, int number2) {		
		int result = (number1 * number2) / findGCD(number1, number2);
		return result;
	}	
}
