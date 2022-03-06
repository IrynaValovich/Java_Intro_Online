package by.htp.oop05_task05a.entity.component;

public enum Color {
	
	WHITE("White"), 
	YELLOW("Yellow"),  
	ORANGE("Orange"), 
	RED("Red"),	 
	PINK("Pink"), 	 
	CORAL("Coral"),	
	LAVENDER("Lavender"), 	 
	VIOLET("Violet"),		 
	GREEN("Green"),	
	INDEFINITE("Indefinite");
	
	private String value;
	
	private Color(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}	
}
