package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task37 {	

/* 
 * Составить линейную программу, печатающую значение true, если указанное высказывание
 * является истинным, и false — в противном случае
 */

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.println("Составить линейную программу, печатающую значение true, если указанное высказывание"
				+ " является истинным, и false — в противном случае");
		
		//1		
		System.out.println("1. Целое число N является четным двузначным числом");
		System.out.println("Введи целое число >> ");
		int N;
		N = scan.nextInt();		
		System.out.println((N % 2 == 0) && (N > 9) && (N < 100));    
        
		//2        
		System.out.println("\n2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр");
		System.out.println("Введи четырехзначное число >> ");
		int num1;
		num1 = scan.nextInt();
		double digit1 = num1 % 10; 
		int num2 = num1 / 10; 
		double digit2 = num2 % 10;
		int num3 = num2 / 10;
		double digit3 = num3 % 10; 
		double digit4 = num3 / 10; 
		int summa1 = (int)(digit4 + digit3); 
		int summa2 = (int)(digit2 + digit1);        
		System.out.println((summa1 == summa2));       

		//3        
		System.out.println("\n3. Сумма цифр данного трехзначного числа N является четным числом");
		System.out.println("Введи трехзначное число >> ");
		int N2;
		N2 = scan.nextInt(); 
		double d1 = N2 % 10;
		double d2 = (N2 / 10) % 10;
		double d3 = (N2 / 100) % 10;
		int summa3 = (int) (d1 + d2 + d3);       
		System.out.println(summa3 % 2 == 0);        

		//4       
		System.out.println("\n4. Точка с координатами (x, y) принадлежит части плоскости, лежащей между прямыми х = m, x = n (m < n)");
		int x;
		int y_y;
		int m;
		int nN;
		System.out.println("Введи координаты x, y через Enter >> ");        
		x = scan.nextInt();
		y_y = scan.nextInt();
		System.out.println("Введи значения m и n (через Enter) с условием m < n >> ");
		m = scan.nextInt();
		nN = scan.nextInt();        
		System.out.println(x >= m && y_y <= nN);                

		// 5.        
		System.out.println("\n5. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа");
		System.out.println("Введи трехзначное число >> "); 
		int n4;
		n4 = scan.nextInt();
		int power = n4 * n4;
		double dig1 = n4 % 10;
		double dig2 = (n4 / 10) % 10;
		double dig3 = (n4 / 100) % 10;
		int summa4 =(int) (dig1 + dig2 + dig3);
		int cube = summa4 * summa4 * summa4;       
		System.out.println(power == cube);       

		// 6.               
		System.out.println("6.Треугольник со сторонами a, b, c равнобедренный");
		double a;
		double b;
		double c;
		System.out.println("Введи стороны треугольника через пробел >> ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();     
		System.out.println(((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a)));             

		// 7
		System.out.println("\n7.Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре");
		System.out.println("Введи трехзначное натуральное число N >> ");
		int n5;
		n5 = scan.nextInt();       
		double newN5= n5 % 10;        
		double newN6 = (n5 / 10) % 10;        
		double newN7 = (n5 / 100) % 10;       
		System.out.println((newN5 + newN6 == newN7) || (newN5 + newN7 == newN6) || (newN7 + newN6 == newN5));         

		// 8
		System.out.println("\n8.Число N является степенью числа a (показатель степени в диапазоне от 0 до 4)");
		System.out.println("Введи число N >> ");
		int n6;
		n6 = scan.nextInt();
		System.out.println("Введи степень a >> "); 
		int aStep;
		aStep = scan.nextInt();
		System.out.println((a >= 0 && a <= 4) && ((n6 == aStep) || 
				(n6 == aStep * aStep) || (n6 == aStep * aStep * aStep) || (n6 == Math.pow(aStep, 4))));                

		// 9.        
		System.out.println("\n9. График функции y = ax2 + bx + c проходит через заданную точку с координатами (m, n)");
		double coordM;
		double coordN;        
		System.out.println("Введи координаты m, n через Enter >> ");        
		coordM = scan.nextDouble();
		coordN = scan.nextDouble();
		double aA;
		double bB;
		double cC;
		System.out.println("Введи значения a, b, c через Enter >> ");
		aA = scan.nextDouble();
		bB = scan.nextDouble();
		cC = scan.nextDouble();        
		System.out.println((aA * coordM * coordM + bB * coordM + cC == coordN));      
		}
}
