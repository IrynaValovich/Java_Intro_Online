package by.htp.sc_task05.counter;

public class ViewCounter {
	
	public static void printCurrentStatement(Counter counter) {
		System.out.println("\nНижняя граница счетчика: " + counter.getMin() + 
						   "\nВерхняя граница счетчика: " + counter.getMax() +
						   "\nТекущее значение счетчика: " + counter.getCurrent() + '\n');
	}	
}
