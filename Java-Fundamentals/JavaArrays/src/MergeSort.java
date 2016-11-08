import java.util.Scanner;


public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		if (count == 2) {
			int temp;
			if (array[0] > array[1]) {
				temp = array[1];
				array[1] = array[0];
				array[0] = temp;
			}
		}
		
		else if (count > 2) {
			count = length/2;
			int[] left = new int[count];
			int[] right = new int[count + 1];
			
			for (int i = 0; i < count; i++){
				left[i] = array[i];
			}
			for (int i = count; i < length; i++){
				right[i - count] = array[i];
			}
			
			MergeSort(left, count);
			MergeSort(right, length - count);
			
			int first = 0;
			int second = 0;
			
			for(int k = 0; k < length; k++){
				if (first < count && second <= count && left[first] <= right[second]) {
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
