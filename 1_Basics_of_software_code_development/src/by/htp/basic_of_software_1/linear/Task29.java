package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task29 {
	
	// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с

	public static void main(String[] args) {		
		double a;
		double b;
		double c;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи длину стороны а >> ");
		a = scan.nextDouble();
		System.out.println("Введи длину стороны b >> ");
		b = scan.nextDouble();
		System.out.println("Введи длину стороны c >> ");
		c = scan.nextDouble();
		
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Стороны треугольника не могут быть отрицательными или равными нулю");
		}
		
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {			
			double cosAlpha;
			double cosBeta;
			double cosHamma;
			cosAlpha = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);			
			cosBeta = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);			
			cosHamma = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b);
			
			double alphaRad;
			double betaRad;
			double hammaRad;
			alphaRad = Math.acos(cosAlpha); 			
			betaRad = Math.acos(cosBeta);			
			hammaRad = Math.acos(cosHamma);
			
			double alphaGrad;
			double hammaGrad;
			double betaGrad;
			alphaGrad = Math.floor((alphaRad * 180) / Math.PI); 			
			hammaGrad = Math.floor((hammaRad * 180) / Math.PI);			
			betaGrad = 180 - alphaGrad - hammaGrad;	
			
			System.out.println("Угол альфа = " + alphaRad + " радиан или " + alphaGrad + " градусов");			
			System.out.println("Угол бета = " + betaRad + " радиан или " + betaGrad + " градусов");			
			System.out.println("Угол гамма = " + hammaRad + " радиан или " + hammaGrad + " градусов");			
		}
		
		if ((((a + b) < c) || ((a + c) < b) || ((b + c) < a))) {
			System.out.println("Невозможно вычислить результат. Сумма двух сторон должна быть больше третьей");
		}		
	}
}
