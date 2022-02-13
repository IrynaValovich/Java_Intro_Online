package by.htp.ac_task03.logic;

import by.htp.ac_task03.entity.State;

public class StateLogic {	
	
	public int counterOfRegions(State state) {
		int counterOfRegions = 0;		
		for (int i = 0; i < state.getRegions().size(); i++) {
			counterOfRegions++;
		}
		return counterOfRegions;		
	}
}
