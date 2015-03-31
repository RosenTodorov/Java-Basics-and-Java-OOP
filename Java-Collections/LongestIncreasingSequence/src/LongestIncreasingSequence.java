import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {
	/**
	 * Write a program to find all increasing sequences inside an array of integers. 
	 * The integers are given in a single line, separated by a space. 
	 * Print the sequences in the order of their appearance in the input array, each at a single line. 
	 * Separate the sequence elements by a space. Find also the longest increasing sequence and print it at the last line. 
	 * If several sequences have the same longest length, print the leftmost of them. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] split = str.split(" ");
		int[] numbers = new int[split.length];
		ArrayList<Integer> displayLongSequence = new ArrayList<Integer>();
		int count = 1;
		int maxCount = 1;
		int position = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}
		
		System.out.println(numbers[0]);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > numbers[i + 1]) {
				System.out.println(" " + numbers[i]);
				count++;
			}
			else {
				count = 1;
				System.out.println("\n" + numbers[i]);
			}
			if (count > maxCount) {
				maxCount = count;
				position = i;
			}
		}
		
		for (int j = maxCount; j > 0; j--) {
			displayLongSequence.add(numbers[position + 1 - j]);
		}
		System.out.println("nLongest" + displayLongSequence);
		}
}
