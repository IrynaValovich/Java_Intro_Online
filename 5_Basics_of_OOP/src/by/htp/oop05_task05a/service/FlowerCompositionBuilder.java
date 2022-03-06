package by.htp.oop05_task05a.service;

import by.htp.oop05_task05a.dao.DAOResource;
import by.htp.oop05_task05a.dao.provider.DAOProvider;
import by.htp.oop05_task05a.entity.fc.FlowerComposition;
import by.htp.oop05_task05a.entity.impl.Wrapp;
import by.htp.oop05_task05a.service.exception.ServiceException;

public abstract class FlowerCompositionBuilder {	
	
	private DAOProvider provider = DAOProvider.getInstance();	
	protected DAOResource<Wrapp> wrappResource = provider.getDAOResourceWrapp();	
	
	public abstract FlowerCompositionBuilder appendCompositionType();
	public abstract FlowerCompositionBuilder appendFlowers(int amount) throws ServiceException;
	public abstract FlowerCompositionBuilder appendWrapp() throws ServiceException;
	public abstract FlowerCompositionBuilder appendPrice() throws ServiceException;
	public abstract FlowerComposition buildFlowerComposition();	 

}
