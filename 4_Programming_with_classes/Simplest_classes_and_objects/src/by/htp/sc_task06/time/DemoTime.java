package by.htp.sc_task06.time;

/*
 * Составьте описание класса для представления времени. Предусмотрите возможность установки времени и изменения его отдельных полей
 * (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class DemoTime {

	public static void main(String[] args) {		
		Time time1 = new Time(11, 60, 06);		
		Time time2 = new Time();		
		
		System.out.println("Задано текущее время: ");
		ViewTime.printTime(time1);		
		ViewTime.printTime(time2);		
		
		System.out.println("Сеттер часов со значением 26, секунд 45 и минут 10: ");
		time1.setHour(26);		
		time2.setSecond(45);		
		time2.setMinute(10);
		ViewTime.printTime(time2);
		
		System.out.println("демонстрация работы методов изменения времени на time2");
		int hours = 5;
		time2.changeHours(hours);
		ViewTime.printTime(time2);
		
		int minutes = 128;
		time2.changeMinutes(minutes);
		ViewTime.printTime(time2);
		
		int seconds = 12;
		time2.changeSeconds(seconds);
		ViewTime.printTime(time2);
	}
}
