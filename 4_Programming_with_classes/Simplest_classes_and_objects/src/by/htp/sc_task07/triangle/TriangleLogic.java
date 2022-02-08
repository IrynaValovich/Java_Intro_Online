package by.htp.sc_task07.triangle;

public class TriangleLogic {	
	
	public Point medianCrossPoint(Triangle triangle) {		
		double x;
		double y;
		x = triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX() / 3;
		y = triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY() / 3;		
		return new Point(x, y);
	}	
	
	public double findArea(Triangle triangle) {
		double pp = (findPerimetr(triangle)) / 2;
		double area;
		area = Math.sqrt(pp * (pp - triangle.getABSide()) * (pp - triangle.getBCSide())	* (pp - triangle.getACSide()));
		return area;
	}
	
	public double findPerimetr(Triangle triangle) {
		return triangle.getABSide() + triangle.getACSide() + triangle.getBCSide();		
	}
}
