package by.htp.basic_of_software_1.cycle;

public class Task16 {
	
	// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

	public static void main(String[] args) {		
		int sum = 3;		
		long multiple = sum;		
		for (int i = 3; i <= 10; i++) {			
			sum = sum + i;			
			multiple *= sum;			
		}		
		System.out.println("Произведение равно " + multiple);		        
	}
}
