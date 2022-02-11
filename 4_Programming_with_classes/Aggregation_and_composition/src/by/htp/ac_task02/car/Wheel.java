package by.htp.ac_task02.car;

import java.util.Objects;

public class Wheel {
	
	private WheelType type;	
	private double diameter;	
	
	public Wheel() {}
	
	public Wheel(WheelType type, double diameter) {
		setType(type);
		setDiameter(diameter);		
	}
	
	public WheelType getType() {
		return type;
	}	
	
	public double getDiameter() {
		return diameter;
	}
	
	public void setType(WheelType type) {		
		this.type = type;		
	}
	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
		if (this.diameter <= 0) {
			throw new IllegalArgumentException("Некорректный параметр на входе");
		}
	}	

	@Override
	public int hashCode() {
		return Objects.hash(diameter, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return Double.doubleToLongBits(diameter) == Double.doubleToLongBits(other.diameter) && type == other.type;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " тип: " + getType().getValue() + ", диаметр: " + getDiameter();
	}	
}
