package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task33 {
	
	// Ввести любой символ, определить его порядковый номер, а также указать предыдущий и последующий символы

	public static void main(String[] args) {		
		char simbol;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print("Введите символ >> ");				
		simbol = scan.next().charAt(0);
		
		int simNumber = (int) simbol;		
		System.out.println("Первый символ - " + simbol + ", его порядковый номер = " + simNumber);
		
		int prevNumber = simNumber - 1;		
		char prevSim = (char) prevNumber;
		System.out.println("Предыдущий символ - " + prevSim + ". Его номер = " + prevNumber);
		
		int nextNumber = simNumber + 1;		
		char nextSim = (char) nextNumber;		
		System.out.println("За символом " + simbol + " следует " + nextSim + ", порядковый номер которого " + nextNumber);		
	}
}
