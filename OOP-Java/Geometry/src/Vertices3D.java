
public class Vertices3D {
	private double x, y, z;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vertices3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return String.format("(%.2f, %.2f, %.2f)", this.x, this.y, this.z);
	}
	
	public static double calcDistance(Vertices3D v1, Vertices3D v2, Vertices3D v3) {
		double deltaX = v1.getX() - v2.getX();
		double deltaY = v1.getY() - v2.getY();
		double deltaZ = v1.getZ() - v2.getZ();
		double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
		return distance;
	}
}




