package by.htp.sc_task06.time;

public class ViewTime {
	
	public static void printTime(Time time) {
		System.out.println(String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond()));
	}
}
