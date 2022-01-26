package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task03 {
	
	//Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное

	public static void main(String[] args) {		
		double x;
		double y;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите значение x >> ");
		x = scan.nextDouble();		
		System.out.print("Введите значение y >> ");
		y = scan.nextDouble();		
		
		double mult;
		mult = x * y;
		System.out.println("Произведение чисел " + x + " и " + y + " равняется " + mult); 
				
		double div;			
		if (y != 0) {
			div = x / y;
			System.out.println("Частное чисел " + x + " и " + y + " равняется " + div);			
		} 
		if (y == 0 || (x == 0 && y == 0)) {
			System.out.println("Вычислить результат невозможно. Ошибка: Деление на ноль");
		}	 
				
		double sum;
		sum = x + y;		
		System.out.println("Сумма чисел " + x + " и " + y + " равняется " + sum); 
				
		double dif;
		dif = x - y;
		System.out.println("Разность чисел " + x + " и " + y + " равняется " + dif);		
	}
}
