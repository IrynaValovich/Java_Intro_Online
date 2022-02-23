package by.htp.oop05_task04.main;

import java.util.Scanner;
import by.htp.oop05_task04.entity.Treasure;
import by.htp.oop05_task04.service.DragonCave;
import by.htp.oop05_task04.service.impl.DragonCaveService;
import by.htp.oop05_task04.view.TreasureView;

/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * * Приложение д.б. объектно-, а не процедурно-ориентированным.
 * * Каждый класс должен иметь отражающее смысл название и информативный состав.
 * * Наследование должно применяться только тогда, когда это имеет смысл.
 * * Использовать соглашение java code convention.
 * * Классы д.б. грамотно разложены по пакетам.
 * * Консольное меню д.б. минимальным.
 * * Для хранения данных можно использовать файлы.
 * 
 *  Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 *  Реализовать возможность просмотра сокровищ, выбора самого дорого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */

public class Demo {
	
	private static Scanner scan = new Scanner(System.in);	

	public static void main(String[] args) {
		
		DragonCave<Treasure> cave = new DragonCaveService();
		
		String message = "\n 1 - показать все сокровища"
				+ "\n 2 - выбрать самое дорогое"
				+ "\n 3 - выбрать на заданную сумму";
		int menuChoice;
		menuChoice = getNumberFromUser(message);
		
		switch(menuChoice) {		
		case 1:
			System.out.println("Полный список сокровищ: ");
			TreasureView.printAllTreasures(cave.getAll());
			break;
		case 2: 
			System.out.println("Самое дорогое сокровище: ");
			TreasureView.printTreasure(cave.getMostExpensive());	
			break;
		case 3:				
			int sum;
			sum = getNumberFromUser("Введи сумму >> ");
			System.out.println("Сокровища на сумму" + " " + sum);
			TreasureView.printAllTreasures(cave.selectForGivenSum(sum));
			break;
		default: 
			System.out.println("Такого пункта в меню нет");	
		}
				
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
		} while (number < 0);			
		return number;
	}
}
