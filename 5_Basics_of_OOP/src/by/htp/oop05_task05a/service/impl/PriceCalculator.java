package by.htp.oop05_task05a.service.impl;

import java.util.List;

import by.htp.oop05_task05a.entity.impl.Flower;
import by.htp.oop05_task05a.entity.impl.Wrapp;
import by.htp.oop05_task05a.service.Computable;
import by.htp.oop05_task05a.service.exception.ServiceException;

public class PriceCalculator implements Computable<Flower, Wrapp> {	

	@Override
	public int computeTotalPrice(List<Flower> flowers, Wrapp wrapp) throws ServiceException {
		if (!flowers.isEmpty()) {
			int totalPrice = 0;
			for (int i = 0; i < flowers.size(); i++) {			
				totalPrice += flowers.get(i).getPrice();
			}
			totalPrice += wrapp.getPrice();
			return totalPrice;
		} else {
			throw new ServiceException("Flower list is empty");
		}
		
	}

}
