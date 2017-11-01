package main.source;

public class Diamond extends Shape {
	public double side;
	public double breadth;
	public double height;
	
	public Diamond(double side, double breadth, double height) {
		this.side = side;
		this.breadth = breadth;
		this.height = height;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public void setSide(double side) {
		if(side < 0) {
			throw new IllegalArgumentException("side cannot be negative");
		}
		
		this.side = side;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setBreadth(double breadth) {
		if(breadth < 0) {
			throw new IllegalArgumentException("breadth cannot be negative");
		}
		
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height < 0) {
			throw new IllegalArgumentException("height cannot be negative");
		}
		
		this.height = height;
	}
	
	@Override
	public double getArea() {
		if (breadth < 0 || height < 0 || breadth == Double.POSITIVE_INFINITY || breadth == Double.NEGATIVE_INFINITY ||
				height == Double.POSITIVE_INFINITY || height == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(breadth) || Double.isNaN(height)) {
					throw new IllegalArgumentException();
		}
		double area = this.breadth * this.height;
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
