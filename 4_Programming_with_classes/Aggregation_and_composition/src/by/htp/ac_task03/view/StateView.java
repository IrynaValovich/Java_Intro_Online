package by.htp.ac_task03.view;

import by.htp.ac_task03.entity.State;

public class StateView {	
	
	public static void printCapital(State state) {
		if (state.getCapital() != null) {
			System.out.printf("Государство: %-8s, столица: %-8s \n", state.getState(), state.getCapital().getCity());			
		} 	
	}
	
	public static void printCounterOfRegions(int counter) {
		System.out.println("Количество областей: " + counter);
	}
	
	public static void printArea(State state) {
		System.out.println("Площадь государства = " + state.getArea());
	}
	
	public static void printRegionCenter(State state) {
		for (int i = 0; i < state.getRegions().size(); i++) {
			System.out.printf("Область %-20s| областной центр %s \n", state.getRegions().get(i).getRegion(), 
					state.getRegions().get(i).getRegionCenter());			
		} 	
	}
	
	public static void printDistricts(State state) {
		for (int i = 0; i < state.getRegions().size(); i++) {
			for (int j = 0; j < state.getRegions().get(i).getDistricts().size(); j++) {
				System.out.println(state.getRegions().get(i).getDistricts().get(j));
			}
		}
	}
}
