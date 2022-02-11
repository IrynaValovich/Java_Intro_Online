package by.htp.ac_task02.car;

public class Engine {
	
	private String serialNumber;
	private double volume;	
	private boolean start;	
	
	public Engine(String serialNumber, double volume) {
		setSerialNumber(serialNumber);
		setVolume(volume);			
	}	
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public double getVolume() {
		return volume;
	}	
	
	public boolean isStart() {
		return start;
	}
	
	public void setSerialNumber(String serialNumber) {
		if (serialNumber == null) {
			throw new IllegalArgumentException("Null на входе"); 
		}
		this.serialNumber = serialNumber;		
	}
	
	public void setStart(boolean start) {
		this.start = start;
	}
	
	public void setVolume(double volume) {
		this.volume = (volume < 0) ? 0 : volume;
	}
	
	public void on() {
		start = true;
		System.out.println("Двигатель заведен");
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " серийный номер: " + getSerialNumber() + ", объем: " + getVolume() + ", сейчас заведен: "
				+ isStart();
	}
}
