package by.htp.oop05_task05a.entity.impl;

import java.io.Serializable;
import java.util.Objects;
import by.htp.oop05_task05a.entity.Commodity;
import by.htp.oop05_task05a.entity.component.Color;

public class Flower extends Commodity implements Serializable {

	private static final long serialVersionUID = 7722220453457762656L;
	private Color color;	

	public Flower(int id, String name, int price, Color color) {
		super(id, name, price);
		setColor(color);		
	}	
	
	private void setColor(Color color) {
		this.color = color;
		if (this.color == null) {
			this.color = Color.INDEFINITE;
		}
	}
	
	public Color getColor() {
		return color;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		return color == other.color;
	}

	@Override
	public String toString() {
		return "\n" + getClass().getSimpleName() + String.format(" id: %-3s|name: %-14s|color: %-14s|price: %s",
				getId(), getName(), getColor().getValue(), getPrice());
	}	
}
