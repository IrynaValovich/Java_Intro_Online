package by.htp.oop05_task05a.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.oop05_task05a.dao.exception.DAOException;
import by.htp.oop05_task05a.entity.component.CompositionType;
import by.htp.oop05_task05a.entity.fc.FlowerComposition;
import by.htp.oop05_task05a.entity.impl.Flower;
import by.htp.oop05_task05a.entity.impl.Wrapp;
import by.htp.oop05_task05a.service.FlowerCompositionBuilder;
import by.htp.oop05_task05a.service.exception.ServiceException;

public class FlowerBasketBuilder extends FlowerCompositionBuilder {
	
	private CompositionType compositionType;	
	private List<Flower> flowers = new ArrayList<Flower>();
	private Wrapp wrapp;
	private int price;

	@Override
	public FlowerCompositionBuilder appendCompositionType() {
		this.compositionType = CompositionType.FLOWERS_IN_BASKET;
		return this;
	}

	@Override
	public FlowerCompositionBuilder appendFlowers(int amount) throws ServiceException {
		FlowerSetFiller filler = new FlowerSetFiller();
		this.flowers = filler.insertFlowers(amount);
		return this;
	}

	@Override
	public FlowerCompositionBuilder appendWrapp() throws ServiceException {
		Wrapp newWrapp;
		try {
			newWrapp = wrappResource.readFile().get(2);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		this.wrapp = newWrapp;
		return this;
	}

	@Override
	public FlowerCompositionBuilder appendPrice() throws ServiceException {
		PriceCalculator pc = new PriceCalculator();
		this.price = pc.computeTotalPrice(flowers, wrapp);		
		return this;
	}

	@Override
	public FlowerComposition buildFlowerComposition() {
		return new FlowerComposition(compositionType, flowers, wrapp, price);
	}
	
	@Override
	public String toString() {
		return " compositionType:" + compositionType.getValue() + "\n" + "flowers: " + flowers + wrapp
				+ "\nprice: " + price;
	}
}
