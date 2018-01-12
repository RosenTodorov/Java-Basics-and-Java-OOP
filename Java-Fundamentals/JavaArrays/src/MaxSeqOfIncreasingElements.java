import java.util.Scanner;

public class MaxSeqOfIncreasingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter your array length: ");
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int[] array = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("Plese enter the elements of the array: ");
			int arrayElement = scanner.nextInt();
			array[i] = arrayElement;     // 1, 2, 4, 3, 0
		}
		
		int maxCount = 0;
		int count = 1;
		String sequence = "";
		String maxSequence = "";
		
		for (int i = 0; i < arrayLength - 1; i++){
			if(array[i] < array[i+1]){
				count++;
				sequence += array[i] + ",";
			}
			else {
				if(count > maxCount){
					maxCount = count;
					sequence += array[i] + ",";
					maxSequence = sequence;				
				}
					count = 1;
					sequence = "";
				}
			}
		
		
			if (count > maxCount){
				sequence += array[array.length - 1];
				maxSequence = sequence;
			}
			
			System.out.println(maxSequence);
		}
}


