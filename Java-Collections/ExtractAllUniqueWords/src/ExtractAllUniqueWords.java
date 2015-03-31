import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
	/**
	 * At the first line at the console you are given a piece of text. 
	 * Extract all words from it and print them in alphabetical order. 
	 * Consider each non-letter character as word separator. Take the repeating words only once. 
	 * Ignore the character casing. Print the result words in a single line, separated by spaces. 
	 */

	public static void main(String[] args) {
		Scanner inputText = new Scanner(System.in);
		String text = inputText.nextLine().toLowerCase();
		String[] words = text.split("[ .:;?!'-]+");
		Set<String> wordsToCheck = new HashSet<String>(Arrays.asList(words));
		TreeSet<String> sortWords = new TreeSet<String>(wordsToCheck);
		
		for (String word : sortWords) {
			System.out.print(word + " ");
		}		
	}
}
