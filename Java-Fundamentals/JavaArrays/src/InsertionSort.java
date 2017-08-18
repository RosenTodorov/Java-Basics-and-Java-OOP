
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - n2
		int[] array = {1,5,334,21,4,3,9};
		
		for (int i = 1; i < array.length; i++) {
		    int next = array[i];
		    int j = i;
	        while (j > 0 && array[j - 1] > next) {
		       array[j] = array[j - 1];
		       j--;
		      }
		      array[j] = next;
		   }		
		for (int i = 0; i < array.length; i++) {
			   System.out.print(array[i] + ",");
	    }
	}
}
