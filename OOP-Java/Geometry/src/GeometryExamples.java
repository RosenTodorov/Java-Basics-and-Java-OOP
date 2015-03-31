import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GeometryExamples {
	public static void main(String[] args) {
		Triangle t = new Triangle(
				new Vertices2D(3, 2),
				new Vertices2D(-12, -3),
				new Vertices2D(30, 25));
	//	System.out.println(t);
		
		Rectangle r = new Rectangle(
				new Vertices2D(3, 2),
				12, 
				7.5);
	//	System.out.println(r);
		
		Circle c = new Circle(
				new Vertices2D(3, -2),
				3.8);
	//	System.out.println(c);
		
		PlaneShape[] planeShapes = { c, r, t };
		for (PlaneShape shape : planeShapes) {
	         		System.out.printf("%s; Area = %.2f; Perimetar = %.2f\n", 
					shape, shape.getArea(), shape.getPerimeter()); 
		} 
		
		SquarePyramid p = new SquarePyramid(
				new Vertices3D(4, 6, 4),
				10, 
				8);
	//	System.out.println(p);
		
		Cuboid cb = new Cuboid(
				new Vertices3D(5, 4, 5),
				14, 
				6,
				2);
	//	System.out.println(cb);
		
		Sphere s = new Sphere(
				new Vertices3D(4, 3, 4),
				2.3);
	//	System.out.println(s);
		
		SpaceShape[] spaceShapes = { s, cb, p };
		for (SpaceShape shape : spaceShapes) {
			System.out.printf("%s; Area = %.2f; Volume = %.2f\n", 
					shape, shape.getArea(), shape.getVolume()); 
		}	
		
		List<Shape> largeVolumeShapes = Arrays.asList(spaceShapes)
				.stream()
				.filter(w -> w instanceof VolumeMeasurable)
				.filter(v -> ((VolumeMeasurable) v)
						         .getVolume() > 40)
						         .collect(Collectors.toList());
		
		for (Shape shape : largeVolumeShapes) {
			System.out.println("The shapes whose volume are over 40: " + shape);
		}
		
		Comparator<Shape> byPerimeter = (s1, s2) -> {
			PerimeterMeasurable Shape1 = (PerimeterMeasurable) s1;
			PerimeterMeasurable Shape2 = (PerimeterMeasurable) s2;
			double perimeterShape1 = Shape1.getPerimeter();
			double perimeterShape2 = Shape2.getPerimeter();
			
			return perimeterShape1 < perimeterShape2 ? -1 :
				perimeterShape1 > perimeterShape2 ? 1 : 0;		
		};
		
		List<Shape> planeShapesByPerimeter = Arrays.asList(planeShapes)
				.stream()
				.filter(k -> k instanceof PlaneShape)
				.sorted(byPerimeter)
				.collect(Collectors.toList());
		
		for (Shape shape : planeShapesByPerimeter) {
			System.out.println("Sort the Plane shapes by their perimeter: " + shape);
		}
	}
}







































