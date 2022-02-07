package by.htp.sc_task03.student;

import java.util.Arrays;

public class Student {
	
	private final static int AMOUNT_OF_MARKS = 5;	
	private String lastNameAndInitials;
	private int groupNumber;
	private int[] marks;	
	
	public Student() {
		this.marks = new int[AMOUNT_OF_MARKS];
	}
	
	public Student(String lastNameAndInitials, int groupNumber, int[] marks) {
		this.lastNameAndInitials = lastNameAndInitials;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}
	
	public String getLastNameAndInitials() {
		return lastNameAndInitials;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public int[] getMarks() {
		return marks;
	}

	public boolean isBestStudent() {
		int localMark = 9;
		int localMark2 = 10;
		for (int i = 0; i < AMOUNT_OF_MARKS; ++i) {
			if (marks[i] != localMark && marks[i] != localMark2) {
				return false;
			}
		}
		return true;		
	}

	@Override
	public String toString() {
		return "Фамилия И.О.: " + lastNameAndInitials + ", №группы: " + groupNumber + ", успеваемость="
				+ Arrays.toString(marks);
	}	
}
