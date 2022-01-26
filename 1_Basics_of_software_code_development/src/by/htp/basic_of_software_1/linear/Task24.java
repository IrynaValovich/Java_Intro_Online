package by.htp.basic_of_software_1.linear;

public class Task24 {
	
	// Найти площадь равнобедренной трапеции с основаниями а и b и углом при большем основании а

	public static void main(String[] args) {		
		double a = 6;
		double b = 3.5;
		double alpha = 52;		
		double alphaRadian = alpha * Math.PI / 180;		
		double s;
		s = 0.5 * (Math.pow(a, 2) - Math.pow(b, 2)) * Math.tan(alphaRadian);		
		System.out.println("При a = " + a + ", b = " + b + " и угле при основании a = " + alpha + " площадь трапеции равна " + s);
	}
}
