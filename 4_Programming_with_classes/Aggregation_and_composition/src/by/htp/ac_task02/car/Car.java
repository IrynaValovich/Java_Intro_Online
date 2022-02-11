package by.htp.ac_task02.car;

import java.util.Arrays;

public class Car {
	
	private final int LIMIT = 4;		
	private String model;
	private final Engine engine;
	private Wheel[] wheels;		
	private double fuelLevel;	
	
	public Car(String model, Engine engine, double fuelLevel) {
		setModel(model);
		this.engine = engine;
		wheels = new Wheel[LIMIT];		
		this.fuelLevel = fuelLevel;		
		if (this.engine == null) {
			throw new IllegalArgumentException("В машине должен быть установлен двигатель!");
		}		
	}
	
	public String getModel() {
		return model;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Wheel[] getWheels() {		
		return wheels;
	}	
	
	public double getFuelLevel() {
		return fuelLevel;
	}
	
	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		}		
	}
	
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}	
	
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel; 
	}
	
	public void addWheel(Wheel wheel) {
		for (int i = 0; i < wheels.length; ++i) {
			getWheels()[i] = wheel;
		}
	}
	
	public void move() {
		if (getFuelLevel() > 0) {
			engine.on();
			System.out.println("Поехали");			
		}
		if (getFuelLevel() <= 0) {
			System.out.println("Бак пустой. Заправь машину");
		}
	}
	
	public void addFuel(double value) {
		fuelLevel += value;		
	}
	
	public void changeWheel(Wheel wheel, int number) {
		if (number >= 0 && number <= 3) {
			for (int i = 0; i < wheels.length; i++) {
				if (i == number) {
					getWheels()[i] = wheel;
				}				 
			}
		}		
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " марка автомобиля: " + getModel() + ", двигатель: " + getEngine() + ", колеса: " 
				+ Arrays.toString(getWheels()) + ", уровень топлива = " + getFuelLevel() + "]";
	}	
}
