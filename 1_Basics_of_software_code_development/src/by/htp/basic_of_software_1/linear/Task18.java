package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task18 {
	
	// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем куба

	public static void main(String[] args) {		
		double a;	
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи длину ребра куба >> ");
		a = scan.nextDouble();
		
		if (a <= 0) {
			System.out.println("Длина не может быть отрицательной или нулевой");
		}
		
		double sGraniCube;
		double sPoverhnosti;
		double vCube;
		if (a > 0) {
			sGraniCube = Math.pow(a, 2);
			sPoverhnosti = 6 * sGraniCube;
			vCube = Math.pow(a, 3);
			System.out.println("При длине ребра куба равной " + a + " площадь грани составит " + sGraniCube);			
			System.out.println("Площадь поверхности = " + sPoverhnosti);			
			System.out.println("Объем куба = " + vCube);			
		}
	}
}
