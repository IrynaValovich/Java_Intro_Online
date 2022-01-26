package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task21 {
	
	/*
	 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
	 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!»
	 * или «Мне нравятся мальчики!
	 */

	public static void main(String[] args) {		
		String answer;		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
        System.out.print("Кто ты: мальчик или девочка? Введи Д или М >> ");        
        answer = scan.next();
        
        switch (answer) {        
            case "Д"-> System.out.println("Мне нравятся девочки!");            
            case "М"-> System.out.println("Мне нравятся мальчики!");            
            default -> System.out.println("Неверное значение!");            
        }        
	}        
}
