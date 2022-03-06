package by.htp.oop05_task05a.dao.provider;

import by.htp.oop05_task05a.dao.DAOResource;
import by.htp.oop05_task05a.dao.impl.DAOFlowers;
import by.htp.oop05_task05a.dao.impl.DAOWrapp;
import by.htp.oop05_task05a.entity.impl.Flower;
import by.htp.oop05_task05a.entity.impl.Wrapp;

public class DAOProvider {
	
	private final static DAOProvider instance = new DAOProvider();
	private final DAOResource<Flower> flowersImpl = new DAOFlowers();
	private final DAOResource<Wrapp> wrappImpl = new DAOWrapp();
	
	private DAOProvider() {}
	
	public static DAOProvider getInstance() {
		return instance;
	}
	
	public DAOResource<Flower> getDAOResourceFlower() {
		return flowersImpl;
	}
	
	public DAOResource<Wrapp> getDAOResourceWrapp() {
		return wrappImpl;
	}
}
