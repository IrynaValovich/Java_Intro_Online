package by.htp.oop05_task03.calendar;

public class Demo {
	
	/*
	 *  Создать класс Calendar с внутренним классом, с помощью объектов которого можно 
	 *  хранить информацию о выходных и праздничных днях
	 */

	public static void main(String[] args) {		
		Calendar calendar = new Calendar();
		calendar.setDates(new Date(21, 3, 2022), new Date(1, 1, 2023),
				new Date(2, 1, 2023), new Date(8, 1, 2023), new Date(11, 1, 2023),
				new Date(2, 2, 2023), new Date(8, 03, 2023), new Date(29, 2, 2024),
				new Date(1, 3, 2024), new Date(9, 5, 2024), new Date(7, 11, 2024));
		CalendarView.printSimpleCalendar(calendar);
	}
}
