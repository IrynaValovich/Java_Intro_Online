package by.htp.basic_of_software_1.linear;

public class Task39 {
	
	/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
	 * сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6")
	 */

	public static void main(String[] args) {		
		double x = 2;
		double z;		
		z = x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;		
		System.out.println("При х = " + x + " итоговое значение равно " + z);
	}
}
