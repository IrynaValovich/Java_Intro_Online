package by.htp.algorithmization_2.decomposition;

public class Task03 {
	
	// Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника

	public static void main(String[] args) {		
		double side_a = 10;		
		double area;
		
		long start = System.nanoTime();
		area = findHexagonArea(side_a);
		long stop = System.nanoTime();		
		
		System.out.println("Площадь правильного шестиугольника со стороной " + side_a + " = " + area);
		System.out.println("Время выполнения алгоритма: " + (stop - start));		
	}	
	
	// метод вычисления площади равностороннего треугольника	
	private static double findTriangleArea(double side) {
		double triangleArea = (side * side * Math.sqrt(3)) / 4;
		return triangleArea;
	}	
		
	private static double findHexagonArea(double side) {		
		return 6 * findTriangleArea(side);		
	}	
}
