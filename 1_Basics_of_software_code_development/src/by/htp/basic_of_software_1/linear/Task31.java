package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task31 {
	
	/*
	 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
	 * Cкорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч. 
	 */
	
	public static void main(String[] args) {		
		double v;
		double v1;
		double t1;
		double t2;	    
		@SuppressWarnings("resource")	
		Scanner scan = new Scanner(System.in);			
		System.out.print("Введите скорость лодки в стоячей воде (v) км/ч) >> ");		
		v = scan.nextDouble();		
		System.out.print("Введите скорость течения реки (v1) км/ч) >> ");		
		v1 = scan.nextDouble();		
		System.out.print("Введите время движения лодки по озеру (t1) ч) >> ");		
		t1 = scan.nextDouble();		
		System.out.print("Введите время движения против течения реки (t2) ч) >> ");		
		t2 = scan.nextDouble();
		
		double dist;
		double vResult;
		double sLength;		
		dist = v * t1; // расстояние, пройденное лодкой по озеру		
		vResult = v - v1; //скорость против течения			
		sLength = dist + vResult * t2;		
		System.out.println("Путь, пройденный лодкой, равен " + sLength + " км");
	}
}
