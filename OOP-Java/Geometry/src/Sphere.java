
public class Sphere extends SpaceShape {  
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Sphere(Vertices3D center, double radius) {
		super(center);
		this.radius = radius;
	}
	
	public String toString() {
		return String.format("Sphere{%s, r = %.2f}", 
				this.vertices.get(0), this.radius);
	}

	@Override
	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
	}

	@Override
	public double getArea() {
		return 4.0 * Math.PI * Math.pow(this.radius, 2);
	}
}
