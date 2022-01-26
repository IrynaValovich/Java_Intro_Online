package by.htp.basic_of_software_1.cycle;

public class Task12 {
	
	/* 
	 * Последовательность a_n строится так: a1 = 1, an = 6 + an-1, для каждого n>1
	 * Составьте программу нахождения произведения первых 10 членов этой последовательности
	 */

	public static void main(String[] args) {		
		long multiple = 1;		
		int aN = 1;			
		for (int i = 2; i <= 10; i++) {			
			aN = 6 + aN;			
			multiple *= aN;			
		}		
		System.out.println("Произведение первых 10 членов последовательности равно " + multiple);
	}	
}
