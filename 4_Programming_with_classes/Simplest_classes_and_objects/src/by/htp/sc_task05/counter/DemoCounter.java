package by.htp.sc_task05.counter;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющий получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.
 */

public class DemoCounter {

	public static void main(String[] args) {		
		Counter counter = new Counter();
		CounterLogic logic = new CounterLogic();
		int limit = 15;		
		ViewCounter.printCurrentStatement(counter);		
		
		logic.increasedValCount(counter, limit);
		ViewCounter.printCurrentStatement(counter);		
		
		counter.setMax(25);
		counter.setMin(3);		
		ViewCounter.printCurrentStatement(counter);
		
		logic.decreasedValCount(counter);
		ViewCounter.printCurrentStatement(counter);		
	}
}
