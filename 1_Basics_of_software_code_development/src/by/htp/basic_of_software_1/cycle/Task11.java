package by.htp.basic_of_software_1.cycle;

public class Task11 {
	
	// Составить программу нахождения разности кубов первых двухсот чисел

	public static void main(String[] args) {
		int dif = 2;
		int counter = 0;
		for (int i = 1; i <= 200; i++) {			
			dif -= i * i * i;
			counter++;
			System.out.println("Разность кубов первых " + counter + " чисел = " + dif);			
        }			
    }	
}
