import java.util.Scanner;


public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - n log(n)
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		Integer[] array = new Integer[length];
		for(int i = 0; i < length; i++){
			int arrayNumbers = scanner.nextInt();
			array[i] = arrayNumbers;
		}
		scanner.nextLine();
		
		QuickSort(array, 0, array.length - 1);
		
		for(int i = 0; i < length; i++) {
			int sortedElementsArray = scanner.nextInt();
			array[i] = sortedElementsArray;
		}
		scanner.nextLine();
	}
	
	    static void QuickSort(Integer[] numbers, int left, int right) {
		int i = left;
		int j = right;
		int pivot = numbers[(left + right)/2];
		
		while (i <= j) {
		while(numbers[i].compareTo(pivot) < 0) {
			i++;
		}
		
		while(numbers[j].compareTo(pivot) > 0) {
			j--;
		}
		
		if(i <= j) {
			int temp = numbers[i];
			numbers[j] = numbers[i];
			numbers[i] = temp;	
			i++;
			j--;
		}
		
		if(left < j) {
			QuickSort(numbers, left, j);
		}
		if(i < right) {
			QuickSort(numbers, i, right);
		}
	} 
	}
}
