
public class SquarePyramid extends SpaceShape {
	private double baseWidth, pyramidHeight;
	
	public SquarePyramid(Vertices3D baseVertex, double baseWidth, double pyramidHeight) {
		super(baseVertex);
		this.baseWidth = baseWidth;
		this.pyramidHeight = pyramidHeight;
	}

	public double getPyramidHeight() {
		return pyramidHeight;
	}

	public void setPyramidHeight(double pyramidHeight) {
		this.pyramidHeight = pyramidHeight;
	}

	public double getBaseWidth() {
		return baseWidth;
	}

	public void setBaseWidth(double baseWidth) {
		this.baseWidth = baseWidth;
	}
	
	@Override
	public String toString() {
		return String.format("SquarePyramid{%s, baseWidth = %.2f, pyramidHeight = %.2f}", 
				this.vertices.get(0), this.baseWidth, this.pyramidHeight);
	}

	@Override
	public double getVolume() {
		return (1.0 / 3.0) * (this.baseWidth * this.baseWidth) * this.pyramidHeight;
	}

	public double getArea() {
		double faceArea = (1.0 / 2.0) * (4 * this.baseWidth) * this.pyramidHeight;
		
		return faceArea + (this.baseWidth * this.baseWidth);
	}
}
