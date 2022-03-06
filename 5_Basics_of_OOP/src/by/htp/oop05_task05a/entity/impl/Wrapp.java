package by.htp.oop05_task05a.entity.impl;

import java.io.Serializable;

import java.util.Objects;

import by.htp.oop05_task05a.entity.Commodity;
import by.htp.oop05_task05a.entity.component.Material;

public class Wrapp extends Commodity implements Serializable {	

	private static final long serialVersionUID = -4043919852170775244L;
	private Material material;	
	
	public Wrapp(int id, String name, int price, Material material) {
		super(id, name, price);		
		setMaterial(material);		
	}
	
	public void setMaterial(Material material) {
		this.material = material;
		if (this.material == null) {
			this.material = Material.INDEFINED;
		}
	}	
	
	public Material getMaterial() {
		return material;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(material);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrapp other = (Wrapp) obj;
		return material == other.material;
	}

	@Override
	public String toString() {
		return "\n" + getClass().getSimpleName() + String.format(" id: %-4s|name: %-14s|material: %-11s|price: %s",				
				getId(), getName(), getMaterial().getValue(), getPrice());
	}	
}
