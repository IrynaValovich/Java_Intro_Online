package by.htp.basic_of_software_1.linear;

public class Task28 {
	
	// Составить программу перевода радианной меры угла в градусы, минуты и секунды

	public static void main(String[] args) {		
		double iRad = 1;		
		double iDegr;        
		iDegr = iRad * 180 / Math.PI;        
		int degree = (int) iDegr;        
		double temp = (iDegr - degree) * 60;         
		int minute = (int) temp;        
		int second = (int) ((temp - minute) * 60);        
		System.out.println(String.format("%s%s° %s%s' %s%s''", degree / 10, degree % 10, minute / 10, minute % 10, second / 10, second % 10));        
	}	
}
