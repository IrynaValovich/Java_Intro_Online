package by.htp.basic_of_software_1.cycle;

import java.util.Scanner;

public class Task31 {
	
	/* 
	 * Проверить введенную пользователем строку на наличие недопустимых символов.
	 * В качестве первого символа допустимы только буквы и знак подчеркивания.
	 * Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
	 */

	public static void main(String[] args) {				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print("Введите текст >> ");
		String user;
		user = scan.nextLine();		
		for (int i = 0; i <= user.length()-1; i++) {			
			if((user.charAt(i) == '_') || (user.charAt(i) >= 'A' && user.charAt(i) <= 'Z') || 
					(user.charAt(i) >= 'a' && user.charAt(i) <= 'z') || (user.charAt(i) >= 'А' && user.charAt(i) <= 'Я') ||
					(user.charAt(i) >= 'а' && user.charAt(i) <= 'я')) {
			System.out.println("No problem in " + user.charAt(i));
			} else if (user.charAt(i+1) >= '0' && user.charAt(i+1) <= '9') {
				System.out.println("No problem in " + user.charAt(i));
			} else {
				System.out.println("Недопустимый символ " + user.charAt(i));
			}
		}				
	}
}
