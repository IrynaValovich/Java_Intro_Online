package by.htp.basic_of_software_1.linear;

public class Task30 {
	
	// Три сопротивления R1, R2 и R3 соединены параллельно. Найдите сопротивление соединения

	public static void main(String[] args) {		
		double r1 = 200;
		double r2 = 470; 
		double r3 = 220;
        double r;        
        r = 1 / (1 / r1 + 1 / r2 + 1 / r3);
        System.out.println("При R1 = " + r1 + ", R2 = " + r2 + " и R3 = " + r3);        
        System.out.println("Сопротивление соединения = " + r);
	}
}
