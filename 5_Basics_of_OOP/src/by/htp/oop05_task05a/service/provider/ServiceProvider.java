package by.htp.oop05_task05a.service.provider;

import by.htp.oop05_task05a.service.FlowerCompositionBuilder;
import by.htp.oop05_task05a.service.impl.BouquetBuilder;
import by.htp.oop05_task05a.service.impl.FlowerBasketBuilder;
import by.htp.oop05_task05a.service.impl.FlowerBoxBuilder;

public final class ServiceProvider {
	
	private final static ServiceProvider instance = new ServiceProvider();
	
	private final FlowerCompositionBuilder bouquetBuilder = new BouquetBuilder(); 
	private final FlowerCompositionBuilder basketBuilder = new FlowerBasketBuilder();
	private final FlowerCompositionBuilder boxBuilder = new FlowerBoxBuilder();
	
	private ServiceProvider() {}
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	public FlowerCompositionBuilder getBouquetBuilder() {
		return bouquetBuilder;
	}
	
	public FlowerCompositionBuilder getBasketBuilder() {
		return basketBuilder;
	}
	
	public FlowerCompositionBuilder getBoxBuilder() {
		return boxBuilder;
	}
}
