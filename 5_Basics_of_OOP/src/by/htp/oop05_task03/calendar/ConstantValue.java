package by.htp.oop05_task03.calendar;

public enum ConstantValue {
	
	MIN(1),
	MAX_MONTH(12),
	MONTH_30(30),
	MONTH_31(31),
	LEAP_BIG_CYCLE(400),
	LEAP_SHORT_CYCLE(4),
	NOT_LEAP(100),
	CALENDAR_VAR(14);
	
	private int value;
	
	private ConstantValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}		
}
