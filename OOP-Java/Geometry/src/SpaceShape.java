import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SpaceShape extends Shape
        implements VolumeMeasurable, AreaMeasurable {
	protected List<Vertices3D> vertices;
	
	public SpaceShape(Vertices3D ... vertices) {
		this.vertices = new ArrayList<Vertices3D>(Arrays.asList(vertices));
	}
}
