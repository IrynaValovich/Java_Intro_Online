package by.htp.basic_of_software_1.linear;

public class Task40 {
	
	/* Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3.
	 * Позаботьтесь об экономии операций
	 */

	public static void main(String[] args) {		
		double x = 2;		
		double z1 = 2 * x + 4 * x * x * x;		
		double z2 = 3 * x * x;		
		double z3 = - z1 + z2;		
		double z4 = 1 + z1 + z2;		
		System.out.println("При х = " + x + " итоговые значения равны " + z3 + " и " + z4);
	}
}
