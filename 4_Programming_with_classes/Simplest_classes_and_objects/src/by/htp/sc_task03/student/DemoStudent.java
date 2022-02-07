package by.htp.sc_task03.student;

public class DemoStudent {
	
	/*
	 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
	 * Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
	 * равные 9 или 10.
	 */

	public static void main(String[] args) {		
		final int amount = 10;
		Student[] students = new Student[amount];		
		
		students[0] = new Student("Zhuk К.A.", 3, new int[] {9, 9, 10, 10, 10});
		students[1] = new Student("Churko G.P.", 2, new int[] {5, 4, 5, 6, 4});
		students[2] = new Student("Blitnuk U.A.", 3, new int[] {8, 6, 5, 7, 5});
		students[3] = new Student("Hant A.M.", 4, new int[] {10, 10, 10, 9, 9});
		students[4] = new Student("Yandarenko R.I.", 1, new int[] {9, 9, 9, 10, 9});
		students[5] = new Student("Volnaya B.Z.", 2, new int[] {10, 10, 10, 10, 10});
		students[6] = new Student("Kronin M.M.", 3, new int[] {7, 7, 9, 8, 9});
		students[7] = new Student("Egorov R.K.", 4, new int[] {10, 10, 10, 10, 9});
		students[8] = new Student("Kaganovich M.I.", 1, new int[] {7, 7, 7, 7, 7});
		students[9] = new Student("Lavinskaya N.G.", 3, new int[] {8, 7, 7, 7, 9});
		
		StudentsView.printAllStudents(students);
		StudentsView.printBestStudents(students);		
	}	
}
