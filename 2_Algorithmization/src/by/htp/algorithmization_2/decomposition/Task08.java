package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task08 {
	
	/*
	 * Задан массив D. Определить суммы: D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6]. Пояснение: составить метод(методы)
	 * для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 7;		
		int arrayD[] = new int[n];
		int summa;
		
		System.out.println("Заполни массив числами ");		
		fillMassiv(arrayD, "Введи целое число >> ");
		
		System.out.println("Считаем сумму значений в трех последовательно расположенных ячейках массива");
		
		long start = System.currentTimeMillis();
		summa = findSumOfArrayNumbers(arrayD, "Введи порядковый номер ячейки, с которой хочешь начать >> ");
		long stop = System.currentTimeMillis();		
		
		System.out.println("Сумма трех элементов массива равняется " + summa);
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
	
	private static int[] fillMassiv(int[] arrayToFill, String message) {				
		for(int i = 0; i < arrayToFill.length; i++) {
			arrayToFill[i] = getNumberFromUser(message);
		}		
		return arrayToFill;
	}
	
	private static int findSimpleSum(int firstNumber, int secondNumber, int thirdNumber) {		
		return firstNumber + secondNumber + thirdNumber;
	}	
	
	private static int findSumOfArrayNumbers(int[] array, String message) {		
		int startIndex;		
		startIndex = enterFromConsole(message);		
		int sum = 0;		
		switch (startIndex) {
		case 0 -> sum = findSimpleSum(array[0], array[1], array[2]);
		case 1 -> sum = findSimpleSum(array[1], array[2], array[3]);
		case 2 -> sum = findSimpleSum(array[2], array[3], array[4]);
		case 3 -> sum = findSimpleSum(array[3], array[4], array[5]);
		case 4 -> sum = findSimpleSum(array[4], array[5], array[6]);
		default -> System.out.println("Ой! Что-то пошло не так. Загрузи программу еще раз");
		}				
		return sum;
	}	
}
