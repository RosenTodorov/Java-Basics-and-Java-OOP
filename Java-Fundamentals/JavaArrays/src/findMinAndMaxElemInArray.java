import java.util.Arrays;
import java.util.Collections;

public class FindMinAndMaxElemInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {121, 324, 4, 2, 23, 10};
		int biggest = arr[0];
		int bigNumber = arr[0];
		int smallest = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(biggest < arr[i]){
				bigNumber = biggest;
				biggest = arr[i];
			} else if (bigNumber < arr[i]){
				bigNumber = arr[i];
			}
			if (smallest > arr[i]){
				smallest = arr[i];
			}
		}
		System.out.println(biggest);
		System.out.println(bigNumber);
		System.out.println(smallest);
		
		Arrays.sort(arr);
		System.out.println("The biggest: "+ arr[arr.length - 1]);
		System.out.println("The second big number is: "+ arr[arr.length - 2]);
		System.out.println("The smallest: "+ arr[0]);
		
	}
}
