package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task34 {
	
	/*
	 * Составить программу, реализующую эпизод в книжном магазине. Комп спрашивает цену книги и сумму,
	 * внесенную покупателем. Если сдачи не нужно, печатает на экране "спасибо". Если денег внесено больше,
	 * печатает "возьмите сдачу" и указывает сумму сдачи. Если денег недостаточно, 
	 * печатает сообщение об этом и указывает размер недостающей суммы.
	 */

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner comp = new Scanner(System.in);		
		System.out.print("Укажите цену книги и сумму, внесенную покупателем >> ");	
		int price;
		int cash;
		price = comp.nextInt();		
		cash = comp.nextInt();
		
		if (price > 0 && cash > 0) {
			if (price == cash) {			
				System.out.println("Спасибо за покупку!");			
			} else if (price < cash) {			
				int change = cash - price;			
				System.out.println("Спасибо за покупку! Возьмите сдачу " + change);			
			} else {			
				int add = price - cash;			
				System.out.println("Средств недостаточно. Доплатите " + add);			
			}
		} else {
			System.out.println("Некорректные данные. Отобразить результат невозможно");
		}		
	}
}
