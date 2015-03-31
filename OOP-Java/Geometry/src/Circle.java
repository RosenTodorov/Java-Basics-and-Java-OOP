
public class Circle extends PlaneShape {
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(Vertices2D center, double radius) {
		super(center);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle{%s, r = %.2f}", 
				this.vertices2D.get(0), this.radius);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}