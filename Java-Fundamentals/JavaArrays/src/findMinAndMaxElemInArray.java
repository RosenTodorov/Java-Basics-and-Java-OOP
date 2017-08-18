
public class findMinAndMaxElemInArray {

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
	}
}
