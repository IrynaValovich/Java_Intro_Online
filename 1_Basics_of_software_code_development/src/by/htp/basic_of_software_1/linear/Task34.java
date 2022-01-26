package by.htp.basic_of_software_1.linear;

public class Task34 {
	
	/* 
	 * Дана величина А, выражающая объем информации в байтах.
	 * Перевести А в более крупные единицы измерения информации");
	 */

	public static void main(String[] args) {		
		long a = 1_999_999_999L;			
		double kBytes, mBytes, gBytes, tBytes;		
		kBytes = a / 1024;
		mBytes = kBytes / 1024;
		gBytes = mBytes / 1024;
		tBytes = gBytes / 1024;		
		System.out.println(a + " байт - это " + kBytes + " Кб,\n" + mBytes + " Мб,\n" + gBytes + " Гб,\n" + tBytes + " Тб");        		
	}
}
