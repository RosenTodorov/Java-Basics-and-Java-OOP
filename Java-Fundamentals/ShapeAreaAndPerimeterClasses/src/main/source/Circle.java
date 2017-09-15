package main.source;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if(radius < 0) {
			throw new IllegalArgumentException("radius cannot be negative");
		}
		
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		if (radius < 0 || radius == Double.POSITIVE_INFINITY || 
				radius == Double.NEGATIVE_INFINITY || Double.isNaN(radius)) {
					throw new IllegalArgumentException();
		}
		double area = Math.PI * (this.radius * this.radius);
		return area;
	}

	@Override
	public double getPerimeter() {
		if (radius < 0 || radius == Double.POSITIVE_INFINITY || 
				radius == Double.NEGATIVE_INFINITY || Double.isNaN(radius)) {
					throw new IllegalArgumentException();
		}
		double perimeter = 2 * Math.PI * this.radius;
		return perimeter;
	}
}
