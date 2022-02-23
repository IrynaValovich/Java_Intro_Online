package by.htp.oop05_task04.entity;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

	private static final long serialVersionUID = -5346124226096294430L;
	private String name;
	private int price;	
	
	public Treasure(String name, int price) {		
		this.name = name;
		this.price = price;
	}	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " name: " + getName() + ", price: " + getPrice();
	}	
}
