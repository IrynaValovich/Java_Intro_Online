package by.htp.oop05_task04.service;

import java.util.List;

public interface DragonCave<T> {
	
	public List<T> getAll();
	public T getMostExpensive();
	public List<T> selectForGivenSum(int summa);	

}
