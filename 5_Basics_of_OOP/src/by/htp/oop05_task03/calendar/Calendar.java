package by.htp.oop05_task03.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calendar {
	
	private List<Date> dates;
	
	public Calendar() {
		dates = new ArrayList<Date>();				
	}
	
	public void setDates(Date... date) {
		for (int i = 0; i < date.length; i++) {
			dates.add(date[i]);
		}
	}
	
	public List<Date> getDates() {
		return dates;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(dates);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(dates, other.dates);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " dates: " + getDates();
	}	
}
