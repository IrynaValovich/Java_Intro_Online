package by.htp.basic_of_software_1.linear;

public class Task02 {
	
	/* 
	 * Вычислить ((b + sqrt(b pow2 + 4 * a * c)) / 2 * a) - a pow3 * c + b pow-2
	 * все переменные принимают действительные значения
	 */
	
	public static void main(String[] args) {		
		double a = 10.0;
		double b = 10.0;
		double c = 2.0;		
		double z;
		
		z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("z = " + z);				
	}
}
