package by.htp.oop05_task03.calendar;

import java.util.Objects;

public final class Date {
	
	public final static int SHORT_FEBRUARY = 28;
	public final static int LEAP_FEBRUARY = 29;
	
	private int day;
	private int month;
	private int year;
	private final WeekInit week;
	private boolean holiday;
	private boolean weekend;	
	
	public Date(int day, int month, int year) {
		setCorrectDate(day, month, year);
		week = new WeekInit();
		setWeekend(checkWeekend());		
		setHoliday(initHoliday());
	}	
	
	private final int initMaxDaysInMonths(int year, int month) {		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			return ConstantValue.MONTH_31.getValue();
		case 4, 6, 9, 11:
			return ConstantValue.MONTH_30.getValue();
		default:
			return (year % ConstantValue.LEAP_SHORT_CYCLE.getValue() != 0 ||
			(year % ConstantValue.NOT_LEAP.getValue() == 0 && year % ConstantValue.LEAP_BIG_CYCLE.getValue() != 0)) ? 
					SHORT_FEBRUARY : LEAP_FEBRUARY;						
		}
	}
	
	public String findNameOfDay() {
		return week.initDayName();		
	}
	
	public final boolean checkWeekend() {								
		return ((week.initDayName() == week.getDayNames()[0]) ||
				(week.initDayName() == week.getDayNames()[6])) ? true : false; 				
	}
	
	// проверка даты на уже существующий праздник в Беларуси	
	private final boolean initHoliday() {
		return ((day == 1 || day == 2 || day == 7) && month == 1) || (day == 8 && month == 3) || 
				((day == 1 || day == 9) && month == 5) || (day == 3 && month == 7) || (day == 7 &&
				month == 11) || (day == 25 && month == 12) ? true : false;		
	}
	
	public void makeHoliday() {
		setHoliday(true);
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean isHoliday() {
		return holiday;
	}
	
	public boolean isWeekend() {
		return weekend;
	}
	
	private void setCorrectDate(int day, int month, int year) {	
		if (month <= ConstantValue.MAX_MONTH.getValue() && month >= ConstantValue.MIN.getValue()) {
			this.month = month;			
		}
		if (day >= ConstantValue.MIN.getValue() && day <= initMaxDaysInMonths(year, this.month)) {
			this.day = day;
		}
		this.year = year;
	}	
	
	private void setWeekend(boolean weekend) {
		this.weekend = weekend;
	}
	
	private void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}	
	
	public class WeekInit {
		
		public final String[] dayNames = new String[] {"Воскресенье", "Понедельник", "Вторник", "Среда", 
				"Четверг", "Пятница", "Суббота"};		
		
		public WeekInit() {}
		
		private int getDayIndex() {
			int monthDif = 2;
			int y = year - (ConstantValue.CALENDAR_VAR.getValue() - month) / ConstantValue.MAX_MONTH.getValue();
			int x = y + y / ConstantValue.LEAP_SHORT_CYCLE.getValue() - y / ConstantValue.NOT_LEAP.getValue() 
					+ y / ConstantValue.LEAP_BIG_CYCLE.getValue();
			int m = month + ConstantValue.MAX_MONTH.getValue() * ((ConstantValue.CALENDAR_VAR.getValue() - month) 
					/ ConstantValue.MAX_MONTH.getValue()) - monthDif;
			int d = (day + x + (ConstantValue.MONTH_31.getValue()*m) / ConstantValue.MAX_MONTH.getValue()) % dayNames.length;
			return d;
		}
		
		public String initDayName() {
			String result = "";
			for (int i = 0; i < dayNames.length; i++) {
				if (i == getDayIndex()) {						
					return result = dayNames[i];
				}				
			}			
			return result;	
		}
		
		public String[] getDayNames() {
			return dayNames; 
		}

		@Override
		public String toString() {
			return "dayNames: " + getDayNames() + ", initDayName(): " + initDayName();
		}			
	}	

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, weekend, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && weekend == other.weekend
				&& year == other.year;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(
				" day: %-3d| month: %-3d| year: %-5d| holiday: %-6s| weekend: %-6s| week: %-6s",
				getDay(), getMonth(), getYear(), isHoliday(), isWeekend(), findNameOfDay());
	}	
}
