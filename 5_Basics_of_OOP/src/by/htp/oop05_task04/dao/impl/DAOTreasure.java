package by.htp.oop05_task04.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.oop05_task04.dao.DAOResource;
import by.htp.oop05_task04.entity.Treasure;

public class DAOTreasure implements DAOResource<Treasure> {

	@Override
	public List<Treasure> loadResource() {			
		List<Treasure> treasures = new ArrayList<Treasure>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("D:\\Eclipse Java Tutorial\\oop05-task04\\src\\resource\\Dragon_Resources.txt"));				
			String line = "";
			String regex = ",";
			while ((line = reader.readLine()) != null) {
				String[] lines = line.split(regex);
				Treasure treasure = new Treasure(lines[0], Integer.parseInt(lines[1]));
				treasures.add(treasure);				
			}
			
		} catch(FileNotFoundException e) {
			System.err.println("Р¤Р°Р№Р» РЅРµ РЅР°Р№РґРµРЅ");									
		} catch(IOException e) {			
			System.err.println("РћС€РёР±РєР° РѕС‚РєСЂС‹С‚РёСЏ РїРѕС‚РѕРєР°");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch(IOException e) {
					System.err.println("РћС€РёР±РєР° Р·Р°РєСЂС‹С‚РёСЏ РїРѕС‚РѕРєР°");
				}
				
			}
		}
		return treasures;		
	}
}
