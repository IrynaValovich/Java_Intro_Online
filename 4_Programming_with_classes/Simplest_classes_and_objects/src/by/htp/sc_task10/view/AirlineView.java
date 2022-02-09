package by.htp.sc_task10.view;

import java.util.List;

import by.htp.sc_task10.entity.Airline;

public class AirlineView {
	
	public static void printAirlines(List<Airline> airlines) {
		for (Airline airline : airlines) {
			System.out.println(airline + " ");
		}		
	}
}
