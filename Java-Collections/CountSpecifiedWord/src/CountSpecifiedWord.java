import java.util.Scanner;

public class CountSpecifiedWord {

	/**
	 * Write a program to find how many times a word appears in given text. 
	 * The text is given at the first input line. The target word is given at the second input line. 
	 * The output is an integer number. Please ignore the character casing. Consider that any non-letter character is 
	 * a word separator. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String[] words = text.split("[ '-]+");
		String wordToFind = scan.next();
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(wordToFind)){
				count++;
			}
		}
		System.out.println(count);
	}
}
