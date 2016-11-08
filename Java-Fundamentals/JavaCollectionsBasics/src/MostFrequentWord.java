import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.StringContent;

public class MostFrequentWord {
	/* Write a program to find the most frequent word in a 
	 * text and print it, as well as how many times it appears 
	 * in format "word -> count". Consider any non-letter 
	 * character as a word separator. Ignore the character 
	 * casing. If several words have the same maximal frequency, 
	 * print all of them in alphabetical order. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().toLowerCase();
		String frequentWord = scanner.nextLine();
		int counter = 0;
		Scanner console = new Scanner(System.in);
		
        Map<String, Integer> wordOccurrences = new Hashtable<>();
        
        String[] words = console.nextLine().toLowerCase().split("\\W+");
 
        int maxWordCount = 0;
        for (String word : words) {
            Integer wordCount = wordOccurrences.get(word);
            if (wordCount == null) {
                wordCount = 0;
            }
            if (wordCount + 1 > maxWordCount) maxWordCount = wordCount + 1;
            wordOccurrences.put(word, wordCount + 1);
        }
 
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            if (entry.getValue() == maxWordCount) {
                System.out.println(entry.getKey() + " -> "
                        + maxWordCount + " times");
            }
	/*	
       while (true) {
			if (text.indexOf(frequentWord, index) != -1) {
				counter++;	
				index = text.indexOf(frequentWord, index) + 1;
			}
			else {
				break;
			}
		}
		if (counter > 0) {
			System.out.println(frequentWord + " -> " + counter + " times");				
		} else { 
			System.out.print("Not available string");
		} */
	}
	}
}

