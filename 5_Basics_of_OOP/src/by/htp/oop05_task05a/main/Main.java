package by.htp.oop05_task05a.main;
import by.htp.oop05_task05a.controller.Receiver;
import by.htp.oop05_task05a.entity.fc.FlowerComposition;
import by.htp.oop05_task05a.view.View;

public class Main {
	
	/*
	 * Создать консольное приложение, удовлетворяющее требованиям:
	 * 1. Спроектируйте и реализуйте предметную область задачи.
	 * 2. Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
	 * 3. Реализуйте проверку данных, вводимых юзером, но не на стороне клиента.
	 * 4. Для проверки корректности переданных данных можно применить регулярные выражения.
	 * 5. Меню выбора действия юзером можно не реализовывать , используйте заглушку.
	 * 6. Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
	 * 
	 * Вариант А. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект,
	 * представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
	 */

	public static void main(String[] args) {
		
		Receiver receiver = new Receiver();
		int amount = 11;
		
		System.out.println("Bouquet");
		FlowerComposition fc = receiver.makeBouquet(amount);
		View.printFlowerComposition(fc);
		
		System.out.println("FlowerBox");
		FlowerComposition box = receiver.makeFlowerBox(amount);
		View.printFlowerComposition(box);
		
		System.out.println("Basket");
		FlowerComposition basket = receiver.makeSummerBasket(amount);
		View.printFlowerComposition(basket);			
	}	
}
