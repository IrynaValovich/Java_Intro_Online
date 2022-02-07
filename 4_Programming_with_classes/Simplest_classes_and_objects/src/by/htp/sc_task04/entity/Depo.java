package by.htp.sc_task04.entity;

import java.util.Arrays;

public class Depo {
	
	private final static int LENGTH = 5;
	private Train[] trains;
	
	public Depo() {
		trains = new Train[LENGTH];
	}

	public static int getLength() {
		return LENGTH;
	}

	public Train[] getTrains() {
		return trains;
	}
	
	public Train[] addTrain(Train t1, Train t2, Train t3, Train t4, Train t5) {
		trains[0] = t1;
		trains[1] = t2;
		trains[2] = t3;
		trains[3] = t4;
		trains[4] = t5;
		return trains;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trains);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		if (!Arrays.equals(trains, other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + Arrays.toString(trains);
	}
}
