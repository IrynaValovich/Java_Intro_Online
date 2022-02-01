package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task17 {
	
	/*
	 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
	 * Сколько таких действий надо произвести, чтобы получить нуль? Для решения задачи использовать декомпозицию.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		int number;
		number = getNumberFromUser("Введи число >> ");
		
		int count;
		long start = System.nanoTime();
		count = counter(number);
		long stop = System.nanoTime();
		System.out.println("Чтобы получить ноль, нужно произвести " + count + " вычитаний");
		System.out.println("Время выполнения алгоритма: " + (stop - start));
	}
	
	private static int enterFromConsole(String message) {					
		System.out.print(message);					
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}					
		return scan.nextInt();					
	}
	
	private static int getNumberFromUser(String message) {
		int number;
		do {
			number = enterFromConsole(message);			
		} while (number <= 0);			
		return number;
	}
	
	private static int findNumberLength(int number) {		
        int numberLength = 0;
        while (number != 0) {
            numberLength++;
            number /= 10;
        }
        return numberLength;
    }
	
	private static int[] getDigits(int number) {		
        int size = findNumberLength(number);
        int[] digits = new int[size];
        for (int i = 1; i <= size; i++) {
            int digit = (int) (number / Math.pow(10, i - 1)) % 10;
            digits[size - i] = digit;
        }
        return digits;		
	}
	
	private static int findSum(int number) {		
        int sum = 0;
        int[] digits = getDigits(number);
        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }
        return sum;
    }    
	
	private static int counter(int number) {		
        int counter = 0;
        while (number > 0) {
            int sum = findSum(number);
            number = number - sum;
            counter++;
        }
        return counter;
    }	
}
