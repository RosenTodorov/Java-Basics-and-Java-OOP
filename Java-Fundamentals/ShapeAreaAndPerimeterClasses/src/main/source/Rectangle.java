package main.source;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("width cannot be negative");
		}
		
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			throw new IllegalArgumentException("height cannot be negative");
		}
		
		this.height = height;
	}
	
	@Override
	public double getArea() {
		if (width < 0 || height < 0 || width == Double.POSITIVE_INFINITY || width == Double.NEGATIVE_INFINITY ||
				height == Double.POSITIVE_INFINITY || height == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(width) || Double.isNaN(height)) {
					throw new IllegalArgumentException();
		}
		double area = this.width * this.height;
		return area;
	}

	@Override
	public double getPerimeter() {
		if (width < 0 || height < 0 || width == Double.POSITIVE_INFINITY || width == Double.NEGATIVE_INFINITY ||
				height == Double.POSITIVE_INFINITY || height == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(width) || Double.isNaN(height)) {
					throw new IllegalArgumentException();
		}
		double perimeter = (2 * this.width) + (2 * this.height);
		return perimeter;
	}
}


