package by.htp.oop05_task05a.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.oop05_task05a.dao.DAOResource;
import by.htp.oop05_task05a.dao.exception.DAOException;
import by.htp.oop05_task05a.entity.component.Material;
import by.htp.oop05_task05a.entity.impl.Wrapp;

public class DAOWrapp implements DAOResource<Wrapp>{

	@Override
	public List<Wrapp> readFile() throws DAOException {
		List<Wrapp> wrapps = new ArrayList<Wrapp>();
		String path = "src/resources/wrapping";		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] wrappsLine = line.split(" - ");
				int id = Integer.parseInt(wrappsLine[0]);
				String commodityName = wrappsLine[1];
				int price = Integer.parseInt(wrappsLine[2]);
				
				Material material = null;
				switch(wrappsLine[3]) {
				case "Paper" -> material = Material.PAPER;				
				case "Carton" -> material = Material.CARTON;				
				case "Wood" -> material = Material.WOOD;				
				default -> material = Material.INDEFINED;				
				}
				wrapps.add(new Wrapp(id, commodityName, price, material));								
			}
			
		} catch (FileNotFoundException e) {
			throw new DAOException("Sorry, I cant find this file", e);
		} catch (IOException e) {			
			throw new DAOException(e);
		} 
		return wrapps;
	}
}
