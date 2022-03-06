package by.htp.oop05_task05a.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.oop05_task05a.dao.DAOResource;
import by.htp.oop05_task05a.dao.exception.DAOException;
import by.htp.oop05_task05a.entity.component.Color;
import by.htp.oop05_task05a.entity.impl.Flower;

public class DAOFlowers implements DAOResource<Flower>{

	@Override
	public List<Flower> readFile() throws DAOException {
		List<Flower> flowers = new ArrayList<Flower>();
		String path = "src/resources/flowers";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] flowersLine = line.split(" - ");
				int id = Integer.parseInt(flowersLine[0]);
				String commodityName = flowersLine[1];
				int price = Integer.parseInt(flowersLine[2]);
				
				Color color = null;
				switch(flowersLine[3]) {
				case "Red" -> color = Color.RED;
				case "White" -> color = Color.WHITE;
				case "Yellow" -> color = Color.YELLOW;
				case "Orange" -> color = Color.ORANGE;
				case "Coral" -> color = Color.CORAL;
				case "Lavender" -> color = Color.LAVENDER;
				case "Violet" -> color = Color.VIOLET;
				case "Pink" -> color = Color.PINK;
				case "Green" -> color = Color.GREEN;				
				default -> color = Color.INDEFINITE;
				}
				flowers.add(new Flower(id, commodityName, price, color));				 			
			}
			
		} catch (FileNotFoundException e) {
			throw new DAOException("Sorry. I cant find this file", e);
		} catch (IOException e) {			
			throw new DAOException(e);
		}
		
		return flowers;
	}	
}
