package by.htp.oop05_task05a.controller;

import by.htp.oop05_task05a.entity.fc.FlowerComposition;
import by.htp.oop05_task05a.service.FlowerCompositionBuilder;
import by.htp.oop05_task05a.service.provider.ServiceProvider;

public class Receiver {

	private Director director = new Director();
	private ServiceProvider provider = ServiceProvider.getInstance();
	
	public FlowerComposition makeFlowerBox(int amount) {
		FlowerCompositionBuilder builder = provider.getBoxBuilder();
		director.setBuilder(builder);
		return director.construct(amount);		
	}
	
	public FlowerComposition makeSummerBasket(int amount) {
		FlowerCompositionBuilder builder = provider.getBasketBuilder();
		director.setBuilder(builder);
		return director.construct(amount);
	}
	
	public FlowerComposition makeBouquet(int amount) {
		FlowerCompositionBuilder builder = provider.getBouquetBuilder();
		director.setBuilder(builder);
		return director.construct(amount);		
	}
}

