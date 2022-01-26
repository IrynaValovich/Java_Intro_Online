package by.htp.basic_of_software_1.linear;

public class Task22 {
	
	/* 
	 * Дано Т длительность прошедшего времени в секундах.
	 * Вывести это значение в часах, минутах и секундах по форме: hhч.mmмин.ssс.
	 */

	public static void main(String[] args) {				
		int t = 12600;		
		int h;
		int m;
		int s;		
		h = t / 3600;
		m = (t - (h * 3600)) / 60;
		s = (t - (h * 3600)) - (m * 60);		
		System.out.println(String.format("%s%sч %s%s мин %s%sс", h / 10, h % 10, m / 10, m % 10, s / 10, s % 10));	
	}	
}
