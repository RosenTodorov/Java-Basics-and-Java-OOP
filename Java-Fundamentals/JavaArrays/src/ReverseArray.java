import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};

		List<Integer> container = new ArrayList<Integer>();
		for (int i = arr.length - 1; i >= 0; i--){
			container.add(arr[i]);
		}
		System.out.println(container);
		Collections.reverse(container);
		System.out.println(container);
	}
}
