
public class Triangle extends PlaneShape {
	public Triangle(Vertices2D v1, Vertices2D v2, Vertices2D v3) {
		super(v1, v2, v3);
	}
	
	@Override
	public String toString() {
		return String.format("Triangle{%s, %s, %s}", 
				this.vertices2D.get(0), this.vertices2D.get(1),
				this.vertices2D.get(2));
	}

	@Override
	public double getPerimeter() {
		double sideA = getSideA();
		double sideB = getSideB();
		double sideC = getSideC();
		double perimetar = sideA + sideB + sideC;
		return perimetar;
	}

	private double getSideC() {
		return Vertices2D.calcDistance(this.vertices2D.get(2), this.vertices2D.get(0));
	}

	private double getSideB() {
		return Vertices2D.calcDistance(this.vertices2D.get(1), this.vertices2D.get(2));
	}

	private double getSideA() {
		return Vertices2D.calcDistance(this.vertices2D.get(0), this.vertices2D.get(1));
	}

	@Override
	public double getArea() {
		double sideA = getSideA();
		double sideB = getSideB();
		double sideC = getSideC();
		double poluPerimetar = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(poluPerimetar * (poluPerimetar - sideA) * (poluPerimetar - sideB) * (poluPerimetar - sideC));
		return area;
	}
}
