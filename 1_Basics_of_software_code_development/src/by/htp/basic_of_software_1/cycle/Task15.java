package by.htp.basic_of_software_1.cycle;

public class Task15 {
	
	// Вычислить: 1+2+4+8+...+ 2 в 10 степени

	public static void main(String[] args) {
        int sum = 0;
        int number = 2;
        for (int i = 0; i <= 10; i++) {        	
            sum += Math.pow(number, i); 
            System.out.println("На " + i + "-ом этапе, результат = " + sum); 
        }        
        System.out.println("Итог: " + sum);        
	}	
}
