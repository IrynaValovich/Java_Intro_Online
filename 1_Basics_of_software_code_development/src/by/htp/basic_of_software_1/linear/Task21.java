package by.htp.basic_of_software_1.linear;

public class Task21 {
	
	/* 
	 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
	 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
	 */

	public static void main(String[] args) {	
		double R;
		double L;		
		R = 213.386;		
		L = (R * 1000) % 1000 + (int) R / 1000.0;		
		System.out.println("Исходное число = " + R);		
		System.out.println("Число после преобразования " + L);
	}
}
