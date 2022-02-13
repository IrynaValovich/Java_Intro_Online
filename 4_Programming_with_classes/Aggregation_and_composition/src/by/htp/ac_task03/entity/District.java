package by.htp.ac_task03.entity;

import java.util.Objects;
import by.htp.ac_task03.validator.Validator;

public final class District {
	
	private String district;	
	private City city;
	
	private District() {}
	
	public static District create(String district, City city) {
		District d = new District();
		d.setDistrict(district);
		d.setCity(city);		
		return d;				
	}	
	
	public String getDistrict() {
		return district;
	}	
	
	public City getCity(){
		return city;
	}
	
	private void setDistrict(String district) {
		this.district = Validator.validateStringParam(district);
	}
	
	public void setCity(City city) {
		this.city = city;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(city, district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(city, other.city) && Objects.equals(district, other.district);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" район: %-13s| город: %s", 
				getDistrict(), getCity());
	}
}
