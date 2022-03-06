package by.htp.oop05_task05a.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.htp.oop05_task05a.dao.DAOResource;
import by.htp.oop05_task05a.dao.exception.DAOException;
import by.htp.oop05_task05a.dao.provider.DAOProvider;
import by.htp.oop05_task05a.entity.impl.Flower;
import by.htp.oop05_task05a.entity.impl.Wrapp;
import by.htp.oop05_task05a.service.exception.ServiceException;

public class FlowerSetFiller {
	
	DAOProvider provider = DAOProvider.getInstance();
	DAOResource<Flower> flowerResource = provider.getDAOResourceFlower();
	DAOResource<Wrapp> wrappResource = provider.getDAOResourceWrapp();
	
	public List<Flower> insertFlowers(int amount) throws ServiceException {
		List<Flower> flowers = new ArrayList<Flower>();
		Random rand = new Random();
		try {
			List<Flower> base = flowerResource.readFile();
			Flower flower = base.get(rand.nextInt(base.size()));
			if (amount > 0) {
				for (int i = 0; i <= amount; i++) {
					flowers.add(flower);
				}				
			} else {
				throw new ServiceException("Amount is negative");
			}
			
		} catch (DAOException e) {			
			throw new ServiceException(e);
		}		
		return flowers;		
	}
}
