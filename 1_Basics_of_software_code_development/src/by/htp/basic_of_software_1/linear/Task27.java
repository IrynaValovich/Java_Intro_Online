package by.htp.basic_of_software_1.linear;

public class Task27 {
	
	/*
	 * Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
	 * получить значение а8 за три операции и а10 за четыре операции
	 */

	public static void main(String[] args) {		
		int a = 2;		
		int a2 = a * a;		
		int a4 = a2 * a2;		
		int a8 = a4 * a4;		
		int a10 = a8 * a2;		
		System.out.println("Если a = " + a + ", а в 8-ой степени = " + a8 + " и а в 10-ой = " + a10);
	}	
}
