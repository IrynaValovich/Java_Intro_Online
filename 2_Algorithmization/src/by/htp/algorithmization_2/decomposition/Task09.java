package by.htp.algorithmization_2.decomposition;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Task09 {
	
	/*
	 * Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
	 * если угол между сторонами длиной X и Y - прямой.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		double x;
		double y;
		double z;
		double t;			
		
		x = getRightParamFromUser("Введи длину X >> ");
		y = getRightParamFromUser("Теперь Y >> ");
		z = getRightParamFromUser("Z >> ");
		t = getRightParamFromUser("T >> ");		
		
		long start = System.nanoTime();
		double result = findAreaOfQuadrangle(x, y, z, t);
		long stop = System.nanoTime();		
		
		System.out.println("Площадь четырехугольника = " + result);
		System.out.println("Время выполнения алгоритма: " + (stop - start));		
	}
	
	private static double enterFromConsole(String message) {		
		System.out.print(message);		
		while(!scan.hasNextDouble()) {
			scan.next();
			System.out.print(message);
		}		
		return scan.nextDouble();		
	}
	
	private static double getRightParamFromUser(String message) {
		double sideOfTriangle;
		do {
			sideOfTriangle = enterFromConsole(message);			
		} while (sideOfTriangle <= 0);			
		return sideOfTriangle;
	}
	
	private static double findAreaOfFirstTriangle(double side1, double side2) {		
		return 0.5 * side1 * side2;				
	}	
	
	private static double findAreaOfSecondTriangle(double k, double l, double m, double e) {		
		double h; //гипотенуза предыдущего треугольника
		double p;
		
		h = sqrt(k * k + l * l);		
		p = 0.5 * (m + e + h);		
		return sqrt(p * (p - m) * (p - e) * (p - h));		
	}
	
	private static double findAreaOfQuadrangle(double a, double b, double c, double d) {		
		return findAreaOfFirstTriangle(a, b) + findAreaOfSecondTriangle(a, b, c, d);				
	}
}
