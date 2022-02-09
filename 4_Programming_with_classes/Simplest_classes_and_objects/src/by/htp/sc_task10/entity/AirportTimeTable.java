package by.htp.sc_task10.entity;

import java.util.ArrayList;
import java.util.List;

public class AirportTimeTable {
	
	private List<Airline> airlines;
	
	public AirportTimeTable() {
		airlines = new ArrayList<Airline>();
	}
	
	public AirportTimeTable(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public List<Airline> getAirlines(){
		return airlines;
	}
	
	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public void addAirline(Airline airline) {
		airlines.add(airline);
	}
	
	public void removeAirline(Airline airline) {
		airlines.remove(airline);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + getAirlines();
	}
}
