import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {
	/* Write a program to enter a number n and n integer numbers and
	 *  sort and print them. Keep the numbers in array of integers: int[]. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		int[] input = new int[length];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		
		Arrays.sort(input);
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
