import java.util.Scanner;

public class CountAllWords {
	/**
	 * Write a program to count the number of words in given sentence. 
	 * Use any non-letter character as word separator.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String[] words = text.split("[ ,'-]+");
		
		System.out.println(words.length);
	}
}
