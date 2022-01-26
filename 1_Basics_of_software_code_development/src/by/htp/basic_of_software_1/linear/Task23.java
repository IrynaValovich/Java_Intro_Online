package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task23 {
	
	// Найти площадь кольца, внутренний радиус которого = r, а внешний - R (R>r)
	
	public static void main(String[] args) {		
		double r;
		double R;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи значение внутреннего радиуса >> ");
		r = scan.nextDouble();
		System.out.println("Введи значение внешнего радиуса >> ");
		R = scan.nextDouble();
		
		if (r <= 0 || R <= 0){
			System.out.println("Ошибка: Радиусы не могут быть отрицательными или принимать значение 0");
		}			
		if (r > 0 && R > 0) {
			double s;
			if (R > r) {
				s = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
				System.out.println("При внутреннем радиусе = " + r + " и внешнем R = " + R + " площадь кольца = " + s);
			}
			if (R <= r) {
				System.out.println("Невозможно вычислить результат. Ошибка: внешний радиус должен быть больше внутреннего");
			}
		} 			
	}	
}
