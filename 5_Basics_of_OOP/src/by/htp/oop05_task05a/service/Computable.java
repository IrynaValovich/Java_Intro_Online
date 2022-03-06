package by.htp.oop05_task05a.service;

import java.util.List;

import by.htp.oop05_task05a.entity.Commodity;
import by.htp.oop05_task05a.service.exception.ServiceException;

public interface Computable<T, W extends Commodity> {	
	
	public int computeTotalPrice(List<T> flowers, W w) throws ServiceException;

}
