package by.htp.oop05_task05a.entity.fc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import by.htp.oop05_task05a.entity.component.CompositionType;
import by.htp.oop05_task05a.entity.impl.Flower;
import by.htp.oop05_task05a.entity.impl.Wrapp;

public final class FlowerComposition implements Serializable {

	private static final long serialVersionUID = 5845878445246962901L;
	private CompositionType compositionType;	
	private List<Flower> flowers = new ArrayList<Flower>();
	private Wrapp wrapp;
	private int price;
	
	public FlowerComposition() {}
	
	public FlowerComposition(CompositionType type, List<Flower> flowers, Wrapp wrapp, int price) {
		compositionType = type;
		this.flowers = flowers;
		this.wrapp = wrapp;
		this.price = price;		
	}
	
	public CompositionType getCompositionType() {
		return compositionType;
	}
	
	public Wrapp getWrapp() {
		return wrapp;
	}
	
	public int getPrice() {
		return price;
	}
	
	public List<Flower> getFlowers(){
		return flowers;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(compositionType, flowers, wrapp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlowerComposition other = (FlowerComposition) obj;
		return compositionType == other.compositionType && Objects.equals(flowers, other.flowers)
				&& Objects.equals(wrapp, other.wrapp);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "compositionType: " + getCompositionType().getValue() + ", flowers: " + getFlowers() 
		+ ", wrapp: " + getWrapp() + ", price: " + getPrice();
	}	
}
