package by.htp.ac_task05.entity;

import java.util.Objects;

public final class Voucher {	
	public final static int MIN_PERSON = 1;
	public final static int MAX_PERSON = 6;
	public final static int MIN_DURATION = 2;
	public final static int MAX_DURATION = 24;	
	
	private TravelType type;
	private String destination;
	private Transport transport;			
	private FoodPackage food;
	private int person;
	private int duration;
	private int price;
	
	private Voucher(Builder builder) {
		this.type = builder.type;				
		this.destination = builder.destination;
		this.transport = builder.transport;
		this.food = builder.food;
		this.person = builder.person;
		this.duration = builder.duration;
		this.price = builder.price;
	}	

	public TravelType getType() {
		return type;
	}
	
	public String getDestination() {
		return destination;
	}

	public Transport getTransport() {
		return transport;
	}

	public int getPerson() {
		return person;
	}

	public FoodPackage getFood() {
		return food;
	}

	public int getDuration() {
		return duration;
	}

	public int getPrice() {
		return price;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(destination, duration, food, person, price, transport, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		return Objects.equals(destination, other.destination) && duration == other.duration && food == other.food
				&& person == other.person && price == other.price && transport == other.transport && type == other.type;
	}	

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(
				" тип ваучера -> %-10s | локация -> %-10s | транспорт -> %-6s | питание -> %-3s | чел.: %-3d | дни: %-3d | цена: %d",
				getType(), getDestination(), getTransport(), getFood().getValue(), getPerson(), getDuration(), getPrice());
	}

	public static class Builder {		
		
		private TravelType type;
		private String destination;
		private Transport transport;		
		private FoodPackage food;
		private int person;
		private int duration;
		private int price;
		
		public Builder(TravelType type, String destination) {			
			this.type = type;
			this.destination = destination;
		}
		
		public Builder appendTransport(Transport transport) {
			this.transport = transport;
			return this;
		}		
		
		public Builder appendFood(FoodPackage food) {
			this.food = food;
			return this;
		}
		
		public Builder appendPerson(int person) {
			this.person = (person >= MIN_PERSON && person <= MAX_PERSON) ? person : MAX_PERSON;
			return this;
		}
		
		public Builder appendDuration(int duration) {
			this.duration = (duration >= MIN_DURATION && duration <= MAX_DURATION) ? duration : MIN_DURATION;
			return this;
		}
		
		public Builder appendPrice(int price) {
			this.price = Math.abs(price);			
			return this;
		}

		public Transport getTransport() {
			return transport;
		}

		public FoodPackage getFood() {
			return food;
		}

		public int getPerson() {
			return person;
		}

		public int getDuration() {
			return duration;
		}

		public int getPrice() {
			return price;
		}

		public Voucher createVoucher() {
			return new Voucher(this);
		}		
	}	
}
