import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String text = scn.nextLine();
		
		String emailMatcher = "((?<=\\s)|^)([a-z0-9][a-z0-9\\-._]*[a-z0-9])@([a-z0-9][a-z0-9\\-]*[a-z0-9]\\.)+[a-z0-9]+";
		
		Pattern pattern =  Pattern.compile(emailMatcher);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("The text contains the following emails:");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
