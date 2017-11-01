package main.source;

public class Cuboid extends Shape {
	private double width;
	private double height;
	private double depth;
	
	public Cuboid(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
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

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		if (depth < 0) {
			throw new IllegalArgumentException("depth cannot be negative");
		}
		
		this.depth = depth;
	}
	
	@Override
	public double getArea() {
		if (width < 0 || height < 0 || depth < 0 || width == Double.POSITIVE_INFINITY || width == Double.NEGATIVE_INFINITY ||
				height == Double.POSITIVE_INFINITY || height == Double.NEGATIVE_INFINITY ||
				depth == Double.POSITIVE_INFINITY || depth == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(width) || Double.isNaN(height) || Double.isNaN(depth)) {
			throw new IllegalArgumentException();
		}
		double area = this.width * this.depth + this.width * this.height + this.height * this.depth;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		if (width < 0 || height < 0 || depth < 0 || width == Double.POSITIVE_INFINITY || width == Double.NEGATIVE_INFINITY ||
				height == Double.POSITIVE_INFINITY || height == Double.NEGATIVE_INFINITY ||
				depth == Double.POSITIVE_INFINITY || depth == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(width) || Double.isNaN(height) || Double.isNaN(depth)) {
			throw new IllegalArgumentException();
		}
		// volume
		double perimeter = this.width * this.height * this.depth;
		return perimeter;
	}

}
