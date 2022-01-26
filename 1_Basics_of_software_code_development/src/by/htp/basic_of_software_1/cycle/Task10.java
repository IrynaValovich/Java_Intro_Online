package by.htp.basic_of_software_1.cycle;

public class Task10 {
	
	// Составить программу нахождения произведения квадратов первых двухсот чисел

	public static void main(String[] args) {			
		long multiple = 1;
		int counter = 0;
		for(int i = 1; i <= 200; i++) {			
			multiple *= i * i;
			counter++;
			System.out.println("Произведение квадратов первых " + counter + " чисел = " + multiple);
			if (multiple > Long.MAX_VALUE / i) {
				System.out.println("На " + counter + "-ом этапе цикла при умножении числа " + i * i 
						+ " на произведение предыдущих чисел произошло переполнение\n"
						+ "Программа остановила вычисления");
			break;
			} 			
		}		
	}	
}
