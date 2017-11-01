package main.source;

public class Square extends Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		if (side < 0) {
			throw new IllegalArgumentException("side cannot be negative");
		}
		
		this.side = side;
	}
	
	@Override
	public double getArea() {
		if (side < 0 || side == Double.POSITIVE_INFINITY || 
				side == Double.NEGATIVE_INFINITY || Double.isNaN(side)) {
					throw new IllegalArgumentException();
		}
		double area = this.side * this.side;
		return area;
	}

	@Override
	public double getPerimeter() {
		if (side < 0 || side == Double.POSITIVE_INFINITY || 
				side == Double.NEGATIVE_INFINITY || Double.isNaN(side)) {
					throw new IllegalArgumentException();
		}
		double perimeter = 4 * this.side;
		return perimeter;
	}
}
