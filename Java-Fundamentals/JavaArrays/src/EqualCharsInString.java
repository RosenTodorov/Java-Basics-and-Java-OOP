import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualCharsInString {

	public static HashSet<Character> equalChar(String word) {
		//word = "Strings".toLowerCase();
		char[] wordChars = word.toLowerCase().toCharArray();
		
		HashSet<Character> uniqueChars = new HashSet<>();
		
		for(char charWord : wordChars){
			if (!uniqueChars.contains(charWord)) {
				uniqueChars.add(charWord);
			}
		}
	
	if(wordChars.length == uniqueChars.size()) {
		System.out.print("There aren't equals chars");
	} else {
		System.out.print("There are equal chars");
	}
	return uniqueChars;
}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine().toLowerCase();
		equalChar(word);

	}
}
