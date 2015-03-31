import java.util.Scanner;

public class CountSubstringOccurrences {
/*
 * Write a program to find how many times given string appears in given text as substring.
 * The text is given at the first input line. The search string is given at the second input line. 
 * The output is an integer number. Please ignore the character casing
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String substrToFind = input.nextLine().toLowerCase();
		int count = 0;
		
		for (int i = 0; i < text.length() - substrToFind.length(); i++) {
			if (text.substring(i, i + substrToFind.length()).equals(substrToFind)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
