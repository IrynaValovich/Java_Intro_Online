package by.htp.sc_task10.entity;

public enum Week {
	MONDAY("Понедельник"), 
	TUESDAY("Вторник"),
	WEDNSDAY("Среда"),
	THURSDAY("Четверг"),
	FRIDAY("Пятница"),
	SATURDAY("Суббота"),
	SUNDAY("Воскресенье");
	
	private String value;
	
	private Week(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
