package by.htp.sc_task10.main;

import by.htp.sc_task10.entity.Airline;
import by.htp.sc_task10.entity.AirportTimeTable;
import by.htp.sc_task10.entity.Week;
import by.htp.sc_task10.logic.AirlineLogic;
import by.htp.sc_task10.view.AirlineView;

public class DemoAirline {
	
	/*
	 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, сеттеры, геттеры и метод toString().
	 * Создать второй класс, агрегирующий массив типа Airline , с подходящими конструкторами и методами. Задать критерии выбора 
	 * данных и вывести эти данные на консоль.
	 * 
	 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
	 * Найти и вывести:
	 * а) список рейсов для заданного пункта назначения;
	 * б) список рейсов для заданного дня недели;
	 * с) список рейсов для заданного дня недели, время вылета для которых больше заданного.
	 */

	public static void main(String[] args) {
		
		AirportTimeTable table = new AirportTimeTable();
		AirlineLogic logic = new AirlineLogic();
		
		Airline airline1 = new Airline.Builder("Warsaw", "LP4555", "12:15", Week.MONDAY)
				.appendAircraftType("Boeing 737")
				.getAirline();
		
		Airline airline2 = new Airline.Builder("Barcelona", "SR1212", "16:40", Week.SUNDAY)
				.appendAircraftType("Boeing 737")
				.getAirline();
		
		Airline airline3 = new Airline.Builder("Paris", "FP0568", "19:00", Week.FRIDAY)
				.appendAircraftType("Airbus A310")
				.getAirline();
		table.addAirline(airline1);
		table.addAirline(airline2);
		table.addAirline(airline3);
		table.addAirline(new Airline.Builder("New York", "UG1915", "10:25", Week.TUESDAY)
				.appendAircraftType("Airbus A330")
				.getAirline());
		table.addAirline(new Airline.Builder("Warsaw", "HR4986", "15:40", Week.MONDAY).getAirline());
		
		Airline airline4 = new Airline.Builder("Warsaw", "LP4555", "12:15", Week.WEDNSDAY).getAirline();
		airline4.setAircraftType("Boeing 737");
		
		table.addAirline(airline4);		
		table.addAirline(new Airline.Builder("Warsaw", "LP4555", "16:20", Week.WEDNSDAY).getAirline());
		table.addAirline(new Airline.Builder("Vilnius", "FR7799", "23:55", Week.TUESDAY)
				.appendAircraftType("Airbus A310")
				.getAirline());
		table.addAirline(new Airline.Builder("Tenerife", "FT6547", "09:00", Week.SATURDAY).getAirline());
		table.addAirline(new Airline.Builder("Barcelona", "SR1212", "16:40", Week.MONDAY).getAirline());
		table.addAirline(new Airline.Builder("Vilnius", "FR7777", "02:10", Week.WEDNSDAY).getAirline());
		table.addAirline(new Airline.Builder("Vilnius", "FR7799", "23:30", Week.THURSDAY)
				.appendAircraftType( "Airbus A310")
				.getAirline());
		table.addAirline(new Airline.Builder("Vilnius", "FR7777", "02:10", Week.FRIDAY)
				.appendAircraftType("Airbus A310")
				.getAirline());		
		table.addAirline(new Airline.Builder("Barcelona", "SR1212", "17:40", Week.THURSDAY)
				.appendAircraftType("Boeing 737")
				.getAirline());
		table.addAirline(new Airline.Builder("Paris", "LG4380", "11:25", Week.SATURDAY)
				.appendAircraftType("Airbus A320")
				.getAirline());
		
		System.out.println("Расписание: ");
		AirlineView.printAirlines(table.getAirlines());
		
		System.out.println("\nСписок рейсов для заданного пункта назначения: ");
		String destination = "Warsaw";
		AirlineView.printAirlines(logic.searchByDestination(table, destination));
		
		System.out.println("\nСписок рейсов для заданного дня недели: ");
		String day = "пятница";
		AirlineView.printAirlines(logic.searchByDay(table, day));
		
		System.out.println("\nСписок рейсов для заданного дня недели, время вылета для которых больше заданного: ");
		String time = "01:00";
		AirlineView.printAirlines(logic.searchByDayAndTime(table, day, time));	
	}
}
