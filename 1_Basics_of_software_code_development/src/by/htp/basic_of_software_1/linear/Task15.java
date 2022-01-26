package by.htp.basic_of_software_1.linear;

public class Task15 {
	
	//Написать программу, которая выводит на экран первые четыре степени числа Пи

	public static void main(String[] args) {		
		double number = Math.PI;
		
		double piOne = Math.pow(number, 1);		
		System.out.println(number + " в первой степени = " + piOne);
		
		double piTwo = Math.pow(number, 2);
		System.out.println(number + " во второй степени = " + piTwo);
		
		double piThree = Math.pow(number, 3);		
		System.out.println(number + " в третьей степени = " + piThree);
		
		double piFour = Math.pow(number, 4);		
		System.out.println(number + " в четвертой степени = " + piFour);		
	}	
}
