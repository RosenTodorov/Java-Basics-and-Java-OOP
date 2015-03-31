
public class Cuboid extends SpaceShape { 
	private double width, height, depth;

	public Cuboid(Vertices3D v1, double width, double height,
			double depth) {
		super(v1);
		this.width = width;
		this.height = height;
		this.depth = depth;
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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return String.format("Cuboid{%s, width = %.2f, height = %.2f, depth = %.2f}", 
				this.vertices.get(0), this.width, this.height, this.depth);
	}

	@Override
	public double getVolume() {
       return this.width * this.height * this.depth;
	}

	@Override
	public double getArea() {
		return (this.width * this.depth +
				this.width * this.height +
				this.height * this.depth);
	}
}
