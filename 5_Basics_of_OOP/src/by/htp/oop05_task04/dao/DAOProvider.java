package by.htp.oop05_task04.dao;

import by.htp.oop05_task04.dao.impl.DAOTreasure;
import by.htp.oop05_task04.entity.Treasure;

public final class DAOProvider {
	
	private final static DAOProvider instance = new DAOProvider();
	
	private DAOResource<Treasure> treasureDAO = new DAOTreasure(); 
	
	private DAOProvider() {}
	
	public static DAOProvider getInstance() {
		return instance;		
	}
	
	public DAOResource<Treasure> getTreasureDAO() {
		return treasureDAO;
	}	
}
