package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task28 {
	
	/*
	 * Написать программу, в которой вводятся два операнда X и Y и знак операции (+, -, /, *).
	 * Вычислить результат Z в зависимости от знака. Предусмотреть реакции 
	 * на возможный неверный знак операции и на ввод Y = 0 при делении. 
	 * Организовать возможность многократных вычислений без перезагрузки программы (т.е. построить цикл).
	 * В качестве символа прекращения вычислений принять '0'
	 */

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		char sign;		
		while (true) {			
			System.out.print("Введите арифметический знак: + или - или * или / >> ");			
			sign = scanner.next().charAt(0);			
			if (sign == '0') {	
				System.out.println("Вычисления прекращены");
				break;				
			} else if (sign == '+' || sign == '-' || sign == '*' || sign == '/') {				
				System.out.print("Введите два числа через пробел >> ");
				double x;
				double y;
				x = scanner.nextDouble();
				y = scanner.nextDouble();
				double z;
				switch (sign) {				
				case '+':					
					z = x + y;					
					System.out.println("Результат сложения первого и второго числа = " + z);					
					break;					
				case '-':					
					z = x - y;					
					System.out.println("Результат вычитания второго числа из первого = " + z);					
					break;					
				case '*':					
					z = x * y;					
					System.out.println("Результат умножения = " + z);					
					break;					
				case '/':					
					if (y < 0 || y > 0) {						
						z = x / y;						
						System.out.println("Результат деления = " + z);						
					} else if (y == 0) {						
						System.out.println("На ноль делить нельзя!");						
					}					
					break;					
				}				
			} else {				
				System.out.println("Некорректный знак");				
			}				
		}		
	}	
}
