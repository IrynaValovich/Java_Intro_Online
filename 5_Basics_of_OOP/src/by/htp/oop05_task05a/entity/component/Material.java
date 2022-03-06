package by.htp.oop05_task05a.entity.component;

public enum Material {
	
	PAPER("Paper"), 
	ORGANZA("Organza"), 
	FILM("Film"), 
	CARTON("Carton"),		
	FATIN("Fatin"), 
	WOOD("Wood"), 
	ECO_LEATHER("EcoLeather"),	 
	INDEFINED("Indefinite");	
	
	private String value;	
	
	private Material(String value) {
		this.value = value;		
	}
	
	public String getValue() {
		return value;
	}	
}
