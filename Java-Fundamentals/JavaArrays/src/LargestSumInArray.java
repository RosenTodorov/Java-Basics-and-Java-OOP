
public class LargestSumInArray {
// maximum contiguous sum in the array and max sum
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{-4, 2, -5, 1, 2, 3, 6, -5, 1};
		
		int currentSum = array[0];
		int maxContSum = array[0];
		int maxSum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (currentSum < 0) {
				currentSum = array[i];
			}
			else {
				currentSum += array[i];
			}
			
			if (currentSum > maxContSum) {
				maxContSum = currentSum;
			}
		}	
		
		System.out.print(maxContSum);
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] > 0) {
				maxSum += array[j];
			}
		}
		System.out.println();
		System.out.print(maxSum);
	}
}
