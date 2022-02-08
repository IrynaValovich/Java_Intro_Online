package by.htp.sc_task07.triangle;

public final class Triangle {
	
	private final Point a;
	private final  Point b;
	private final Point c;
	
	public Triangle(final Point a, final Point b, final Point c) {		
		this.a = a;
		this.b = b;
		this.c = c;						
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}	
	
	public double getABSide() {		
		double distanceX = getA().getX() - getB().getX();
		double distanceY = getA().getY() - getB().getY();		
		return Math.sqrt(distanceX * distanceX + distanceY * distanceY);		
	}
	
	public double getACSide() {
		double distanceX = getA().getX() - getC().getX();
		double distanceY = getA().getY() - getC().getY();		
		return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
	}
	
	public double getBCSide() {
		double distanceX = getB().getX() - getC().getX();
		double distanceY = getB().getY() - getC().getY();		
		return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\nвершины треугольника: a = " + getA() + ", b = " + getB() + ", c = " + getC()
			+ "\n стороны треугольника: AB = " + getABSide() + ", AC = " + getACSide() + ", BC = " + getBCSide();
	}	
}
