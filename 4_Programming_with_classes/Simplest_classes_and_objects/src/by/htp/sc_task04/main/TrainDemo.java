package by.htp.sc_task04.main;

import by.htp.sc_task04.entity.Depo;
import by.htp.sc_task04.entity.Train;
import by.htp.sc_task04.logic.TrainLogic;
import by.htp.sc_task04.view.TrainView;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train,
 * добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 * упорядочены по времени отправления.
 */

public class TrainDemo {

	public static void main(String[] args) {		
		Train train1 = new Train("Warsaw", 1, "10:15");
		Train train2 = new Train("Minsk", 5, "22:00");
		Train train3 = new Train("Krakow", 4, "11:15");
		Train train4 = new Train("Warsaw", 2, "08:00");
		Train train5 = new Train("Minsk", 3, "16:30");
		
		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();		
		Input input = new Input();
		
		depo.addTrain(train1, train2, train3, train4, train5);
		
		System.out.println("Вывод на консоль массива поездов");
		TrainView.printTrains(depo);
		
		System.out.println("\nСортировка поездов по номеру");	
		logic.sortByNumber(depo);
		TrainView.printTrains(depo);		
		
		System.out.println("\nСортировка по пункту назначения");		
		logic.sortByDestination(depo);
		TrainView.printTrains(depo);	
		
		int userNumber;
		userNumber = input.enterFromConsole(depo, "\nВведи номер поезда >> ");
		TrainView.printByNumber(depo, userNumber);
	}
}
