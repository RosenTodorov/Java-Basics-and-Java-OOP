import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {
	/**
	 * Write a program to find the most frequent word in a text and print it, as well as how many times it appears 
	 * in format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing. 
	 * If several words have the same maximal frequency, print all of them in alphabetical order.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().toLowerCase()
				.split("([.,()!?:;'\"-]|\\s)+");
		Map<String, Integer> wordsThree = new TreeMap<>();
		
		int maxCount = 0;
		for (String word : words) {
			Integer count = wordsThree.get(word);
			if (count == null) {
				count = 0;
			}
			if (count + 1 > maxCount) {
				maxCount = count + 1;
			}
			wordsThree.put(word, count + 1);
		}
		
		for (Map.Entry<String, Integer> max : wordsThree.entrySet()) {
			if (max.getValue() == maxCount) {
				System.out.printf("%s -> %d times\n", max.getKey(), max.getValue());						
			}
		}
	}

}
