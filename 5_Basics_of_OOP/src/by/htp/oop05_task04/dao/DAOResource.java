package by.htp.oop05_task04.dao;

import java.util.List;

public interface DAOResource<T> {
	
	public List<T> loadResource();

}
