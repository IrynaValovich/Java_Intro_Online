package by.htp.oop05_task05a.dao;

import java.util.List;

import by.htp.oop05_task05a.dao.exception.DAOException;
import by.htp.oop05_task05a.entity.Commodity;

public interface DAOResource<T extends Commodity> {
	
	public List<T> readFile() throws DAOException;

}
