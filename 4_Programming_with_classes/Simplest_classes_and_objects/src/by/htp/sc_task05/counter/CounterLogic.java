package by.htp.sc_task05.counter;

public class CounterLogic {
	
	public void increasedValCount(Counter counter, int limit) {
		for (int i = 0; i < limit; i++) {
			counter.increment();
		}
	}
	
	public void decreasedValCount(Counter counter) {
		while(counter.getCurrent() != counter.getMin()) {
			counter.decrement();			
		}	
	}
}
