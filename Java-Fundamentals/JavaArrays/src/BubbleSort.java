
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - n
		int[] arr = {1,5,334,21,4,3,9};
		
		int n = arr.length;  
	    int temp = 0;  
	    
	    for(int i=0; i < n; i++){  
	       for(int j=1; j < (n-i); j++){  
	          if(arr[j-1] > arr[j]){  
	          //swap elements  
	          temp = arr[j-1];  
	          arr[j-1] = arr[j];  
	          arr[j] = temp; 
	          }
	       }                                   
	    }
	    for (int i = 0; i < arr.length; i++) {
			   System.out.print(arr[i] + ",");
	    }
	}
}
	
	

	


