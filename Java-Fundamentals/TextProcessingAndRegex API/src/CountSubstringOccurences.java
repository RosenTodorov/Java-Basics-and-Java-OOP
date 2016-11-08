import java.util.Scanner;

public class CountSubstringOccurences {
	/* Write a program to find how many times given string appears 
	 * in given text as substring. The text is given at the first 
	 * input line. The search string is given at the second input 
	 * line. The output is an integer number. Please ignore the character 
	 * casing. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the text: ");
		String text = scanner.nextLine().toLowerCase();
		System.out.print("Enter the substring: ");
		String substring = scanner.nextLine().toLowerCase();
		int count = 0;
		
		int index = text.indexOf(substring);
		
		while (index != - 1) {
			index = text.indexOf(substring, index + 1);
			count++;
		}
		
		System.out.println(count);
	}
}


