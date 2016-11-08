import java.util.Scanner;

public class LongestIncreasingSequence {
/* Write a program to find all increasing sequences inside an array of integers. 
 * The integers are given in a single line, separated by a space. Print the sequences in the order 
 * of their appearance in the input array, each at a single line. Separate the sequence elements 
 * by a space. Find also the longest increasing sequence and print it at the last line. 
 * If several sequences have the same longest length, print the leftmost of them
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] arrayInput = input.split(" ");
		int[] numbers = new int[arrayInput.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(arrayInput[i]);		
		}
		
		int longestSequence = 1;
		int increaseSequence = 1;
		int index = 0;
		
	    System.out.print(arrayInput[0]);
		
		for (int i = 1; i < arrayInput.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				increaseSequence++;
				System.out.print(" " + arrayInput[i]);
			} else {
				increaseSequence = 1;
				System.out.println();
				System.out.print(arrayInput[i]);
			}
			
			if (increaseSequence > longestSequence) {
				longestSequence = increaseSequence;
				index = i;								
			}
		}
		
		System.out.println();
		System.out.print("Longest: ");
		
		for (int j = 0; j < longestSequence; j++) {
			System.out.print(arrayInput[index - longestSequence + 1 + j] + " ");
		}
	}
}
