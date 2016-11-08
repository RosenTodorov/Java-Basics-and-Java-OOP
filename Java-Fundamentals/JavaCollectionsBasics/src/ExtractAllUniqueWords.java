import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExtractAllUniqueWords {
	/* At the first line at the console you are given a
	 * piece of text. Extract all words from it and print
	 * them in alphabetical order. Consider each non-letter
	 * character as word separator. Take the repeating
	 * words only once. Ignore the character casing. Print
	 * the result words in a single line, separated by spaces. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split("\\W+");
		
		Set<String> uniqueWords = new HashSet<>();
		for (String word : words) {
			if (!uniqueWords.contains(word)) {
			uniqueWords.add(word);
			}		
		}
		
		for (String text : uniqueWords) {
			System.out.print(text.toLowerCase() + " ");
		}
	}
}
