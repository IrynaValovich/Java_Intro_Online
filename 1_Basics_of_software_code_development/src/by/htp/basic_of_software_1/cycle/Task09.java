package by.htp.basic_of_software_1.cycle;

public class Task09 {
	
	// Найти сумму квадратов первых ста чисел

	public static void main(String[] args) {		
		int sum = 0;		
		for (int i = 1; i <= 100; i++) {			
			sum = sum + i * i;			
		}		
		System.out.println("Сумма квадратов первых 100 чисел равна " + sum);		
		// Сумма квадратов первых n чисел проверяется по формуле (n*(n+1)*(2*n+1))/6		
	}	
}
