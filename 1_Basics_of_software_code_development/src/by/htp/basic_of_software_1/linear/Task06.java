package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task06 {
	
	// Найдите значение функции: с = 3 + а

	public static void main(String[] args) {		
		double a;
		double c;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);		
		System.out.print("Введите значение для a >> ");               
        a = in.nextDouble();        
        c = 3 + a;        
        System.out.println("При а = " + a + " значение функции с = " + c);        
	}
}
