package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task33 {
	
	/* 
	 * Написать программу, которая по паролю определяет уровень доступа сотрудника к секретной
	 * информации в базе данных. Доступ к базе есть у 6 человек, разбитых на 3 группы по степени доступа:
	 * 9583, 1747 - доступны модули баз А, В, С
	 * 3331, 7922 - доступны модули баз В, С и 9455, 8997 - доступ к модулю С
	 */

	public static void main(String[] args) {		
		String password;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print("Введите пароль >> ");		
		password = scan.next();
		
		switch (password) {		
			case "9583", "1747" -> System.out.println("Доступ к модулям A, B, C открыт");			
			case "3331", "7922" -> System.out.println("Доступ к модулям B, C открыт");			
			case "9455", "8997" -> System.out.println("Доступ к модулю C открыт");			
			default -> System.out.println("Пароль неверный");			
		}
	}	
}
