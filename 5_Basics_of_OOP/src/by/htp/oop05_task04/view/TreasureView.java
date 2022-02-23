package by.htp.oop05_task04.view;

import java.util.List;

import by.htp.oop05_task04.entity.Treasure;

public class TreasureView {	
	
	public static void printAllTreasures(List<Treasure> treasures) {
		for (Treasure t : treasures) {
			System.out.println(t);
		}		
	}
		
	public static void printTreasure(Treasure treasure) {
		System.out.println(treasure);
	}
}
