package by.htp.oop05_task05a.controller;

import by.htp.oop05_task05a.entity.fc.FlowerComposition;
import by.htp.oop05_task05a.service.FlowerCompositionBuilder;
import by.htp.oop05_task05a.service.exception.ServiceException;

public class Director {
	
	private FlowerCompositionBuilder builder;
	
	public Director() {}	
	
	public void setBuilder(FlowerCompositionBuilder builder) {
		this.builder = builder;
	}
	
	public FlowerComposition construct(int amount) {
		FlowerComposition fc = null;
		try {
			fc = builder.appendCompositionType()
					.appendFlowers(amount)
					.appendWrapp()
					.appendPrice()
					.buildFlowerComposition();
		} catch (ServiceException e) {			
			e.printStackTrace();
		}
		return fc;
	}
}
