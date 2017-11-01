import java.util.HashSet;
import java.util.Set;

public class FindTheMissingNumberInArray {
	// find the missing number on integer array of 1 to 6 (or 100) 
	public static void main(String[] args) {
	
    int arr[] = {1,2,4,5,6};
    int maxNumberInArray = 6; // the max number in array (or 100)
    int missNumber = getMissingNumber(arr, maxNumberInArray);
    System.out.println(missNumber);
    /*
      1 way
    1. Get the sum of numbers: 
       total = n*(n+1)/2 or n*(n+1)*(n+2)/2
    2  Subtract all the numbers from sum and
       you will get the missing number. 
    */
	}
    public static int getMissingNumber(int array[], int maxNumberInArray) {    	
    int total = maxNumberInArray*(maxNumberInArray + 1)/2; // the sum of numbers 
    for (int i = 0; i < array.length; i++){
    	total -= array[i];
    }
    return total;
    }
        
   /*   2 way
        int arr[] = {1,2,4,5,6};
        
		Set<Integer> uniqieNumbers = new HashSet<Integer>();
		Set<Integer> equalNumbers = new HashSet<Integer>();
		
		String missNumber = " ";
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < arr.length; j++) {
			if (i != arr[j]) {
				uniqieNumbers.add(i); // all numbers => 1,2,3,4,5,6
			}
			else {
				equalNumbers.add(i); // numbers in arr => 1,2,4,5,6
			}
		}
	}
		for (Integer number : uniqieNumbers) {
			if (!equalNumbers.contains(number)) {
				missNumber += number;
			}
		}
		System.out.println(missNumber); // => 3  */
    
    /*   3 way
     1) XOR all the array elements, let the result of XOR be X1.
     2) XOR all numbers from 1 to n, let XOR be X2.
     3) XOR of X1 and X2 gives the missing number.
        
    public static int getMissingNo (int a[], int n)
    {
        int i;
        int x1 = a[0]; 
        int x2 = 1; 
         
     // For xor of all the elements in array 
        for (i = 1; i < n; i++)
            x1 = x1^a[i];
                 
     // For xor of all the elements from 1 to n+1       
        for (i = 2; i <= n+1; i++)
            x2 = x2^i;         
         
        return (x1^x2);
    } */
}
