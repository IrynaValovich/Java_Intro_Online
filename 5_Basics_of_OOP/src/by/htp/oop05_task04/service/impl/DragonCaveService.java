package by.htp.oop05_task04.service.impl;

import java.util.ArrayList;

import java.util.List;
import by.htp.oop05_task04.dao.DAOProvider;
import by.htp.oop05_task04.dao.DAOResource;
import by.htp.oop05_task04.entity.Treasure;
import by.htp.oop05_task04.service.DragonCave;

public class DragonCaveService implements DragonCave<Treasure> {
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public List<Treasure> getAll() {
		DAOResource<Treasure> tDAO = provider.getTreasureDAO();
		List<Treasure> treasures;
		treasures = tDAO.loadResource();		
		return treasures;
	}

	@Override
	public Treasure getMostExpensive() {
		List<Treasure> treasures = getAll();
		Treasure t = treasures.get(0);
		for (Treasure treasure : treasures) {
			if (treasure.getPrice() > t.getPrice()) {
				t = treasure;
			}
		}
		return t;
	}

	@Override
	public List<Treasure> selectForGivenSum(int summa) {
		List<Treasure> treasures = getAll();
		List<Treasure> treasuresForGivenSum = new ArrayList<Treasure>();
		for (int i = treasures.size() - 1; i >= 0; i--) {
			int current = price(treasuresForGivenSum);
			if ((current + treasures.get(i).getPrice()) <= summa) {
				treasuresForGivenSum.add(treasures.get(i));				
			}			
		}		
		return treasuresForGivenSum;
	}
	
	private int price(List<Treasure> treasures) {		
		int sum = 0;		
		for (Treasure t : treasures) {
			sum += t.getPrice();
		}
		return sum;
	}

}
