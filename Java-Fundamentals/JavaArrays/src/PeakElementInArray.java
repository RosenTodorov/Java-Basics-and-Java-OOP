
public class PeakElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,10,2,15,7};
		int n = arr.length;
		System.out.println("Index of a peak point is " +
				findPeak(arr, n));	
	}
	
	static int findPeak(int arr[], int min, int max, int n){
		int mid = (min + max)/2;
		if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n-1 || arr[mid + 1] <= arr[mid])){
			return mid;
		}
			else if (mid > 0 && arr[mid+1] > arr[mid]){				
				return findPeak(arr, (mid + 1), max, n);
			}
		
			else {
				return findPeak(arr, min, (mid - 1), n);
			}
	}
	
	static int findPeak(int arr[], int n){
		return findPeak(arr, 0, n-1, n);
	}
}

	
