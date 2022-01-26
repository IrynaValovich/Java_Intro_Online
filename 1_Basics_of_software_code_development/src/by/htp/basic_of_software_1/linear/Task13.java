package by.htp.basic_of_software_1.linear;

public class Task13 {
	
	// Заданы координаты трех вершин треугольника (х1, у2), (х2, у2), (х3, у3). Найти периметр и площадь

	public static void main(String[] args) {		
		double x1 = - 5;		
		double y1 = - 8;		
		double x2 = 5;		
		double y2 = - 3;		
		double x3 = 3;		
		double y3 = 5;
		
		double da;
		da = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));		
		double db;
		db = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));		
		double dc;
		dc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));		
		double p;
		p = da + db + dc;		
		double p1;
		p1 = 0.5 * p; // Полупериметр для вычисления площади по формуле Герона		
		double s;
		s = Math.sqrt(p1 * (p1 - da) * (p1 - db) * (p1 - dc));
		
		System.out.println("Периметр треугольника p = " + p);
        System.out.println("Площадь треугольника s = " + s);
	}	
}
