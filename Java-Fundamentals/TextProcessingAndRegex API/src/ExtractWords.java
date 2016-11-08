import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
	/* Write a program that extracts words from a string. Words are sequences of characters 
	 * that are at least two symbols long and consist only of English alphabet letters. Use regex.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("([a-zA-Z]+)");
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
	}
}
