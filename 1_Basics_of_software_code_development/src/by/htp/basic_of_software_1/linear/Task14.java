package by.htp.basic_of_software_1.linear;

public class Task14 {
	
	// Вычислить длину окружности и площадь круга одного и того же заданного радиуса

	public static void main(String[] args) {		
		double r = 12; 		
		double c; 		 
		c = 2 * r * Math.PI;		
		System.out.println("При радиусе " + r + " метров длина окружности равна " + c + " метров");		
		double s;
		s = Math.pow(c, 2) / (4 * Math.PI);		
		System.out.println("Площадь круга составит " + s + " м. кв.");
	}	
}
