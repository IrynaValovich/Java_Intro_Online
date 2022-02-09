package by.htp.sc_task10.logic;

import by.htp.sc_task10.entity.AirportTimeTable;

import java.util.ArrayList;
import java.util.List;
import by.htp.sc_task10.entity.Airline;

public class AirlineLogic {
	
	public List<Airline> searchByDestination(AirportTimeTable airlines, String destination) {
		List<Airline> airlinesByDestination = new ArrayList<Airline>();		
		for (int i = 0; i < airlines.getAirlines().size(); i++) {
			if (airlines.getAirlines().get(i).getDestination().equalsIgnoreCase(destination)) {
				airlinesByDestination.add(airlines.getAirlines().get(i));
			}
		}
		return airlinesByDestination;				
	}
	
	public List<Airline> searchByDay(AirportTimeTable airlines, String day) {
		List<Airline> airlinesByDay = new ArrayList<Airline>();			
		for (int i = 0; i < airlines.getAirlines().size(); i++) {
			if (airlines.getAirlines().get(i).getDay().getValue().equalsIgnoreCase(day)) {
				airlinesByDay.add(airlines.getAirlines().get(i));
			}
		}
		return airlinesByDay;		
	}
	
	public List<Airline> searchByDayAndTime(AirportTimeTable airlines, String day, String time) {
		List<Airline> airlinesByDayAndTime = new ArrayList<Airline>();		
		for (int i = 0; i < airlines.getAirlines().size(); i++) {
			if (airlines.getAirlines().get(i).getDay().getValue().equalsIgnoreCase(day) &&
					airlines.getAirlines().get(i).getDepartureTime().compareToIgnoreCase(time) > 0) {
				airlinesByDayAndTime.add(airlines.getAirlines().get(i));				
			}
		}
		return airlinesByDayAndTime;
	}	
}
