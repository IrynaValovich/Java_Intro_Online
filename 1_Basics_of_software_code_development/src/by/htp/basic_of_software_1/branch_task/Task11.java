package by.htp.basic_of_software_1.branch_task;

public class Task11 {
	
	// Составить программу, которая определит, площадь какого треугольника больше	

	public static void main(String[] args) {		
		int a1 = 7;
		int h1 = 6;
		int a2 = 7;
		int h2 = 9;
		
		double s1;
		double s2;		
		s1 = 0.5 * a1 * h1;
		s2 = 0.5 * a2 * h2;			
		if (s1 != s2) {
			if (s1 > s2) {				
				System.out.println("Площадь треугольника со стороной " + a1 + " и высотой " + h1 
						+ " больше, чем площадь другого треугольника");			
			} else {			
				System.out.println("Площадь треугольника со стороной " + a2 + " и высотой " + h2 
						+ " больше, чем площадь другого треугольника");			
			} 
		} else {
			System.out.println("Площади треугольников равны");
		}		 	
	}
}
