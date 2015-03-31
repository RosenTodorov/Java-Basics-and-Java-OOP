import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
	/**
	 * Write a program that enters from the console number n and n strings, then sorts them alphabetically and prints them.
	 * Note: you might need to learn how to use loops and arrays in Java (search in Internet). 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int n = scan.nextInt();
		System.out.println("Enter your words: ");
		String[] words = new String[n];

		for (int i = 0; i < words.length; i++) {
			words[i] = scan.next();
		}

		Arrays.sort(words);

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
