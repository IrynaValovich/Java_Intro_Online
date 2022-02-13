package by.htp.ac_task03.entity;

import java.util.Objects;
import by.htp.ac_task03.validator.Validator;

public final class City {
	
	private String city;	
	private boolean capital;
	private boolean regionCenter;	
	
	private City() {}
	
	public static City create(String city, boolean capital, boolean regionCenter) {		
		City c = new City();
		c.setCity(city);
		c.setCapital(capital);
		c.setRegionCenter(regionCenter);		
		return c;		
	}
	
	public String getCity() {
		return city;
	}	
	
	public boolean isCapital() {
		return capital;
	}
	
	public boolean isRegionCenter() {
		return regionCenter;
	}
	
	private void setCity(String city) {
		this.city = Validator.validateStringParam(city);
	}
	
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	
	public void setRegionCenter(boolean regionCenter) {
		this.regionCenter = regionCenter;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(capital, city, regionCenter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return capital == other.capital && Objects.equals(city, other.city) && regionCenter == other.regionCenter;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" город: %-8s| столица: %-8s| областной центр: %-10s", 
				getCity(), isCapital(), isRegionCenter());
	}
}
