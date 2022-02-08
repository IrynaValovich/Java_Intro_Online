package by.htp.sc_task07.triangle;

public class DemoTriangle {
	
	/*
	 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра
	 * и точки пересечения медиан.
	 */

	public static void main(String[] args) {
		Point a = new Point(2, 4);
		Point b = new Point(4, 2);
		Point c = new Point(2, 0);
		
		Triangle triangle = new Triangle(a, b, c);		
		System.out.println(triangle);		
		
		TriangleLogic logic = new TriangleLogic();		
		
		System.out.println("Площадь треугольника = " + logic.findArea(triangle));
		System.out.println("Периметр треугольника = " + logic.findPerimetr(triangle));
		System.out.println("Точка пересечения медиан: " + logic.medianCrossPoint(triangle));
	}
}
