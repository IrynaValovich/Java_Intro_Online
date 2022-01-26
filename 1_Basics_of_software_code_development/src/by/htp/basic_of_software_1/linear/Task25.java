package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task25 {
	
	/* 
	 * Вычислить корни квадратного уравнения а * powх2 + bх + с = 0 с заданными коэффициентами a, b и с 
	 * предполагается, что а!=0 и что дискриминант уравнения неотрицателен
	 */

	public static void main(String[] args) {		
		double a;
		double b;
		double c;				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 		
		System.out.print("Введите числовое значение a >> ");		
		a = scan.nextDouble(); 		
		System.out.print("Введите числовое значение b >> ");		
		b = scan.nextDouble(); 		
		System.out.print("Введите числовое значение c >> ");		
		c = scan.nextDouble();
		
		if (a == 0) {
			System.out.println("Ошибка: Должно соблюдаться условие а!=0");
		}
		
		double d;
		if (a != 0) {
			d = Math.pow(b, 2) - 4 * a * c; // Дискриминант
			double x1;
			double x2;
			double x3;
			if (d > 0) {			
				x1 = (-b + Math.sqrt(d)) / (2 * a);			
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
			} 
			if (d == 0) {			
				x3 = -b / (2 * a);
				System.out.println("Уравнение имеет только один корень: x = " + x3);
			} 
			if (d < 0) {
				System.out.println("Уравнение не имеет корней");     
			}
		} 	
	}		
}
