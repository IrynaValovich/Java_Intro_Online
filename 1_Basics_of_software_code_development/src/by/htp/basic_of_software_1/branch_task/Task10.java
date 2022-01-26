package by.htp.basic_of_software_1.branch_task;

import java.util.Scanner;

public class Task10 {
	
	// Составить программу, определяющую площадь какого круга меньше

	public static void main(String[] args) {
		int choice;		
		System.out.println("Чтобы узнать, площадь какого круга меньше, нужны исходные данные");		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		System.out.print("Знаешь диаметры кругов? Введи цифру 1\n" 
				+ "Известны радиусы? Введи цифру 2\n" 
				+ "Есть длины окружностей? Введи цифру 3\n" 
				+ "Для завершения программы введи 0 >> ");		
		choice = scan.nextInt();
		
		if (choice >= 0 && choice < 5) {
			double result;
			switch (choice) {			
			
			case 1:				
				double d1;
				double d2;				
				System.out.print("Введи диаметр первого круга >> ");			
				d1 = scan.nextDouble();				
				System.out.print("Введи диаметр второго круга >> ");			
				d2 = scan.nextDouble();				
				if (d1 > 0 && d2 > 0) {
					if (d1 != d2) {						
						result = (d1 < d2) ? d1 : d2;
						System.out.println("Площадь круга с диаметром " + result + " меньше");										
					} else {
						System.out.println("Площади кругов равны");
					}					
				} else {
					System.out.println("Невозможно вычислить результат. Диаметр не может иметь нулевое или отрицательное значение");
				}				
				break;				
			
			case 2:				
				double r1;
				double r2;				
				System.out.print("Введи радиус первого круга >> ");			
				r1 = scan.nextDouble();				
				System.out.print("Введи радиус второго круга >> ");			
				r2 = scan.nextDouble();				
				if (r1 > 0 && r2 > 0) {
					if (r1 != r2) {
						result = (r1 < r2) ? r1 : r2;
						System.out.println("Площадь круга с радиусом " + result + " меньше");						
					} else {
						System.out.println("Площади кругов равны");
					}					
				} else {
					System.out.println("Невозможно вычислить результат. Радиус не может иметь нулевое или отрицательное значение");
				}				
				break;				
			
			case 3:				
				double l1;
				double l2;				
				System.out.print("Введи длину окружности первого круга >> ");			
				l1 = scan.nextDouble();				
				System.out.print("Введи длину окружности второго круга >> ");			
				l2 = scan.nextDouble();				
				if (l1 > 0 && l2 > 0) {
					if (l1 != l2) {
						result = (l1 < l2) ? l1 : l2;
						System.out.println("Площадь круга с длиной окружности " + result + " меньше");							
					} else {
						System.out.println("Площади кругов равны");
					}					
				} else {
					System.out.println("Невозможно вычислить результат. Длина окружности не может иметь нулевое или отрицательное значение");
				}				
				break;
			
			case 0:
				System.out.println("Вы вышли из программы");
				System.exit(0);
			}					
		} else {
			System.out.println("Такого пункта в меню нет. Перезапусти программу");
		}		
	}
}

