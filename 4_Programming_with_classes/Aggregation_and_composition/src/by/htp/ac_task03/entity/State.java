package by.htp.ac_task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import by.htp.ac_task03.validator.Validator;

public final class State {
	
	private String state;
	private int area;
	private List<Region> regions;
	private City capital;	
	
	private State() {
		area = 0;
		regions = new ArrayList<Region>();
	}
	
	public static State create(String state, City capital) {
		State s = new State();
		s.setState(state);
		s.setCapital(capital);		
		return s;			
	}
	
	public void addRegions(Region...region) {
		for (int i = 0; i < region.length; i++) {
			regions.add(region[i]);
			area += region[i].getArea();
			for (int j =0; j < region[i].getDistricts().size(); j++) {
				if (region[i].getDistricts().get(j).getCity().isCapital()) {
					capital = region[i].getDistricts().get(j).getCity();
				}
			}							
		}		
	}

	public String getState() {
		return state;
	}

	public int getArea() {
		return area;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public City getCapital() {
		return capital;
	}
	
	private void setState(String state) {
		this.state = Validator.validateStringParam(state);
	}
	
	public void setCapital(City capital) {
		this.capital = capital;
	}		

	@Override
	public int hashCode() {
		return Objects.hash(capital, regions, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(regions, other.regions)
				&& Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" государство: %-8s| площадь: %-8s| области: %-10s| столица: %s",
				getState(), getArea(), getRegions(), getCapital());
	}	

}
