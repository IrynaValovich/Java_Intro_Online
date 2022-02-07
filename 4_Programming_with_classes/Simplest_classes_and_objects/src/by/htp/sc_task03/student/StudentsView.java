package by.htp.sc_task03.student;

public class StudentsView {
	
	public static void printAllStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("[" + students[i].toString() + "] ");
		}		
	}
	
	public static void printBestStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].isBestStudent()) {
				System.out.println("Фамилия: " + students[i].getLastNameAndInitials() + ", №группы: " 
						+ students[i].getGroupNumber());
			}
		}
	}
}
