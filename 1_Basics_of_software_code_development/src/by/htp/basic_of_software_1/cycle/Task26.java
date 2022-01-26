package by.htp.basic_of_software_1.cycle;

public class Task26 {
	
	// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII)

	public static void main(String[] args) {		
		System.out.println("-----------------");
		System.out.printf("%-4s|%8s\n","№","Symbol");
		System.out.println("-----------------");		
		for (int i = 32; i <= 255; i++) {			
			System.out.printf("%-4s|%8s\n", i, (char) i);			
		}			
	}
}
