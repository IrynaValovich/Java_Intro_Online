package by.htp.basic_of_software_1.linear;

public class Task19 {
	
	//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью

	public static void main(String[] args) {				
		double l = 12;		
		double s;		
		s = (Math.pow(l, 2) / (4 * Math.PI));		
		System.out.println("При длине окружности равной " + l + " площадь круга составит " + s);
	}	
}
