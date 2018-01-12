import java.util.Arrays;

public class TheMostRepeatIntegerInArray {
// {-5, 1, 0, 4, 0, -5, 1, 0, 4} --> 0
	public static void main(String[] args) {
		int[] arr = {-5, 1, 0, 4, 5, 5, 0, -5, 1, 0, 4, 1, 4, 4, 5, 5, 5, 5, 1, 4};
	    int count = 1;
		int maxCount = 0;
		int popularNum = arr[0];
				
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;	
					if (count > maxCount) {
						maxCount = count;
						popularNum = arr[j];
						count = 0;
					}
				}
			}
		}
		System.out.print(popularNum);
		/* second way
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] == arr[i]) {
				count++;
				if (count > maxCount) {
					maxCount = count;
					popularNum = arr[i];
					count = 0;
				}
			}
		}
		System.out.print(popularNum); */
	} 
}
