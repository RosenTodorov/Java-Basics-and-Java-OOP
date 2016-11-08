import java.util.Scanner;


public class SequenceOfGivenSum {
	// Write a program that finds in given array of integers a sequence of given sum S (if present).    
	// Example: {4, 3, 1, 4, 2, 5, 8}, S=11  {4, 2, 5}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 3, 1, 4, 2, 5, 8 };
		System.out.println("Enter the desired sum: ");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		
		int sum = 0;
		int count = 0;
		String elements = "";
		
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			
			for (int j = i; j < array.length; j++){
				sum = sum + array[j];
				elements = elements + " " + array[j];
				
				if (sum == s){
					
					System.out.println("The elements for your desired sum are: " + elements);
					count++;
					sum = 0;
					elements = "";
				}
				if (sum > s){
					elements = "";
					sum = 0;
					break;					
				}
			}
		}	
		
		if (count == 0) {
			System.out.println("There is no numbers, forming that sum!");
		}
	}
}

