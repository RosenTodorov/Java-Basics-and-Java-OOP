

public class Vertices2D {
	private double x, y;

	public Vertices2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

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
	
	@Override
	public String toString() {
		return String.format("(%.2f, %.2f)", this.x, this.y);
	}
	
	public static double calcDistance(Vertices2D v1, Vertices2D v2) {
		double deltaX = v1.getX() - v2.getX();
		double deltaY = v1.getY() - v2.getY();
		double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return distance;
	}
}
