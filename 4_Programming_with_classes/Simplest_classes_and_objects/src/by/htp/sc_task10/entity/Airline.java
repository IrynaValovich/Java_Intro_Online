package by.htp.sc_task10.entity;

public final class Airline {
	
	private final String destination;
	private final String flightNumber;
	private final String departureTime;
	private String aircraftType;
	private final Week day;
	
	private Airline(Builder builder) {
		this.destination = builder.destination;
		this.flightNumber = builder.flightNumber;
		this.departureTime = builder.departureTime;
		this.aircraftType = builder.aircraftType;
		this.day = builder.day;		
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public String getFlightNumber() {
		return this.flightNumber;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}
	
	public String getAircraftType() {
		return this.aircraftType;
	}
	
	public Week getDay() {
		return this.day;
	}
	
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (day != other.day)
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		return true;
	}	

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" пункт назначения -> %-10s| № рейса -> %-7s| время отправления -> %-6s| "
				+ "тип самолета -> %-13s| день недели: %-5s",
				getDestination(), getFlightNumber(), getDepartureTime(), getAircraftType(), getDay().getValue());			
	}

	public static class Builder {
		
		private final String destination;
		private final String flightNumber;
		private final String departureTime;
		private String aircraftType;
		private final Week day;
		
		public Builder(
				final String destination,
				final String flightNumber,
				final String departureTime,
				final Week day) {
			
			this.destination = destination;	
			this.flightNumber = flightNumber;
			this.departureTime = departureTime;
			this.day = day;
			if (this.destination == null || this.flightNumber == null || this.departureTime == null || this.day == null) {
				throw new IllegalArgumentException("Null во входных параметрах");
			}			
		}
		
		public Builder appendAircraftType(String aircraftType) {
			this.aircraftType = aircraftType;
			return this;
		}
		
		public Airline getAirline() {
			return new Airline(this);
		}		
	}
}
