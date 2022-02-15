package by.htp.ac_task05.entity;

public enum FoodPackage {
	
	ROOM_ONLY("RO"),
	BED_AND_BREAKFAST("BB"),
	HALF_BOARD("HB"),
	FULL_BOARD("FB"),
	ALL_INCLUSIVE("AI"),
	ULTRA_ALL_INCLUSIVE("UAI"),
	NONE("--");

	private String value;	
	
	private FoodPackage(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}	
}	