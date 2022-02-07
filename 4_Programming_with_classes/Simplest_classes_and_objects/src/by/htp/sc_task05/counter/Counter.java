package by.htp.sc_task05.counter;

public class Counter {
	
	private int max;
	private int min;
	private int current;
	
	public Counter() {
		min = 0;
		current = 0;
		max = 1000;
	}
	
	public Counter(int max, int min, int current) {
		if ((current <= max && current >= min) && (min < max)) {
			this.max = max;
			this.min = min;
			this.current = current;			
		} else {
			this.max = 1000;
			this.min = 0;
			this.current = 1;
		}
	}
	
	public void increment() {
		current++;
		if (current == max) {
			System.out.println("Текущее значение = " + current + " и оно совпадает с максимумом");
		}		
		if (current < max) {
			System.out.println("Значение счетчика увеличено на единицу ");
			System.out.println("Текущее значение = " + current);
		}	
		
	}
	
	public void decrement() {
		current--;
		if (current == min) {
			System.out.println("Текущее значение = " + current + " и оно совпадает с минимумом");
		}
		if (current > min) {
			System.out.println("Значение счетчика уменьшено на единицу ");
			System.out.println("Текущее значение счетчика = " + current);
		}
	}		
	
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getCurrent() {
		return current;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public void setCurrent(int current) {
		this.current = current;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + max;
		result = prime * result + min;
		result = prime * result + current;
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;		
		Counter other = (Counter) o;		
		if (max != other.max) return false;
		if (min != other.min) return false;
		if (current != other.current) return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "max = " + getMax() + ", min = " + getMin() + ", current = " + getCurrent();
	}
}
