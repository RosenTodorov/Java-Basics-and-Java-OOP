
public class Rectangle extends PlaneShape {
	private double width, height;
	
	public Rectangle(Vertices2D v1, double width, double height) {
		super(v1);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle{%s, width = %.2f, height = %.2f}", 
				this.vertices2D.get(0), this.width, this.height);
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}
}