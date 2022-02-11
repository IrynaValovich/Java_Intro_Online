package by.htp.ac_task02.car;

public enum WheelType {
	WINTER("Зимнее"),
	SUMMER("Летнее");
	
	private String value;
	
	private WheelType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
