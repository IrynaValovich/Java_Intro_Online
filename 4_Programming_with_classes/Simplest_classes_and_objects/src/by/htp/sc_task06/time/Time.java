package by.htp.sc_task06.time;

/*
 * Составьте описание класса для представления времени. Предусмотрите возможность установки времени и изменения его отдельных полей
 * (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {}
	
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}	
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		this.hour = (hour < 0 || hour > 23) ? 0 : hour;		
	}
	
	public void setMinute(int minute) {
		this.minute = (minute < 0 || minute > 59) ? 0 : minute;
	}
	
	public void setSecond(int second) {
		this.second = (second < 0 || second > 59) ? 0 : second;
	}
	
	public void changeHours(int hours) {
		hour = ((hour + hours) > 23) ? ((hour + hours) % 24) : hour + hours;				
	}
	
	public void changeMinutes(int minutes) {		
		if ((minute + minutes) > 59) {
			minute = (minute + minutes) % 60;
			this.changeHours((minute + minutes) / 60);
		} else {
			minute += minutes;
		}
	}
	
	public void changeSeconds(int seconds) {
		if ((second + seconds) > 59) {
			second = (second + seconds) % 60;
			this.changeMinutes((second + seconds) / 60);
		} else {
			second += seconds;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + minute;		
		return result;		
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Time other = (Time) o;
		if (hour != other.hour) return false;
		if (minute != other.minute) return false;
		if (second != other.second) return false;		
		return true;		
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "hour = " + getHour() + ", minute = " + getMinute() + ", second = " + getSecond();
	}
}
