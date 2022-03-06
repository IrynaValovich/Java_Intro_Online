package by.htp.oop05_task05a.entity.component;

public enum CompositionType {
	
	BOUQUET("Bouquet"), 
	FLOWERS_IN_BOX("FlowersInBox"), 
	FLOWERS_IN_BASKET("FlowersInBasket");
	
	private String value;
	
	private CompositionType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}	
}
