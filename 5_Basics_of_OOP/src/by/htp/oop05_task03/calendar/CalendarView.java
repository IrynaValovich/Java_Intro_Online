package by.htp.oop05_task03.calendar;

public class CalendarView {
	
	public static void printSimpleCalendar(Calendar calendar) {		
		for (int i = 0; i < calendar.getDates().size(); i++) {
			System.out.print(calendar.getDates().get(i) + "\n");
		}
		System.out.println();
	}	
}
