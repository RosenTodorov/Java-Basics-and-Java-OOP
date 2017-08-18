
public class QuickSortMethod {
	public static void QuickSort(Integer[] numbers, int left, int right) {
		int i = left;
		int j = right;
		// Get the pivot element from the middle of the list
		int pivot = numbers[left + (right - left)/2];
		
		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller than the pivot
			while (numbers[i] < pivot) {
				i++;
				// element then get the next element from the left list
			}
			// If the current value from the right list is larger than the pivot
			while (numbers[j] > pivot) {
				j--;
				// element then get the next element from the right list
			}
			/*If we have found a value in the left list which is larger than the pivot element and 
			 *if we have found a value in the right list which is smaller than the pivot element 
			 *then we exchange the values. */
			if (i <= j) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				// As we are done we can increase i and j.
				i++;
				j--;
			}
		}
		// Recursion
		if (left < j) {
			QuickSort(numbers, left, j);
		}
		if (i < right) {
			QuickSort(numbers, i, right);
		}
	}
}
	