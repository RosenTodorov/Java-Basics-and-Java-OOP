import java.util.Scanner;


public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - n log(n)
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i < number; i++){
		   int elementArray = scanner.nextInt();
		   array[i] = elementArray;
		}
		 MergeSort(array, number);
		 for(int i = 0; i < number; i++){
			 int sortedElementsArray = scanner.nextInt();
			 array[i] = sortedElementsArray;
		 }
	}
	
	static void MergeSort(int[] array, int length) {
		int count = array.length;
	//	int inversionCount = 0;
		
		if (count == 2) {
			int temp;
			if (array[0] > array[1]) {
				temp = array[1];
				array[1] = array[0];
				array[0] = temp;
			}
		}
		
		else if (count > 2) {
			int middle = length/2;
			// puts the sorted output in the auxiliary array
			int[] left = new int[middle];
			int[] right = new int[middle + 1];
			
			for (int i = 0; i < middle; i++){
				left[i] = array[i];
			}
			for (int i = middle; i < length; i++){
				right[i - middle] = array[i];
			//  inversionCount = inversionCount + (i - middle);
			}
			
			MergeSort(left, middle);
			MergeSort(right, length - middle);
			
			int first = 0;
			int second = 0;
			
			for(int k = 0; k < length; k++){
				if (first < middle && second <= middle && left[first] <= right[second]) {
					array[k] = left[first];
					first++;
				}
				else {
					array[k] = right[second];
					second++;
				}
			}
		}
	}

}
