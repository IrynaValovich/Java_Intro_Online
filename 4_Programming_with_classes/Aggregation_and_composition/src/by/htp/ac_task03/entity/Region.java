package by.htp.ac_task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import by.htp.ac_task03.validator.Validator;

public final class Region {
	
	private String region;
	private int area;	
	private City regionCenter;
	private List<District> districts = new ArrayList<District>();
	
	private Region() {		
		districts = new ArrayList<District>();
	}	
	
	public static Region create(String region, int area) {
		Region r = new Region();
		r.setRegion(region);
		r.setArea(area);		
		return r;		
	}
	
	public void addDistricts(District... district) {
		for (int i = 0; i < district.length; i++) {
			districts.add(district[i]);
		}
	}
	
	public City getRegionCenter() {
		City regionCenter = null;
		for (int i = 0; i < districts.size(); i++) {
			if (districts.get(i).getCity().isRegionCenter()) {
				return regionCenter = districts.get(i).getCity();
			}			
		}
		return regionCenter;
	}
	
	public String getRegion() {
		return region;
	}
	
	public int getArea() {
		return area;
	}
	
	private void setRegion(String region) {
		this.region = Validator.validateStringParam(region);
	}
	
	private void setArea(int area) {
		this.area = Validator.validateIntParam(area);
	}
	
	public List<District> getDistricts() {
		return districts;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(area, region, regionCenter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return area == other.area && Objects.equals(region, other.region)
				&& Objects.equals(regionCenter, other.regionCenter);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" область: %-20s| площадь: %-8s| областной центр: %-10s| районы: %s",
				getRegion(), getArea(), regionCenter, getDistricts());
	}
}
