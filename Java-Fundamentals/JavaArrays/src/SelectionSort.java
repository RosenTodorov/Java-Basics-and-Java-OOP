import java.util.Scanner;


public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - n2
		int[] array = {1,5,334,21,4,3,9};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
		   System.out.print(array[i] + ",");
		}
	}
}
