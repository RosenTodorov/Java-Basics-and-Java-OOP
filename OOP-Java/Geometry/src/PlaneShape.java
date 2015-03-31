import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PlaneShape extends Shape
        implements PerimeterMeasurable, AreaMeasurable {
	protected List<Vertices2D> vertices2D;

	public PlaneShape(Vertices2D ... vertices2D) {
		this.vertices2D = new ArrayList<Vertices2D>(Arrays.asList(vertices2D));
	}	
}
