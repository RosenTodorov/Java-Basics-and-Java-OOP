import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {
	/*
	 * Write a program to extract all email addresses from given text.
	 *  The text comes at the first input line. Print the emails in the output, each at a separate line. 
	 * Emails are considered to be in format <user>@<host>, 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputText = scan.nextLine();
		
		Pattern emailsPattern = Pattern.compile("[_A-Za-z0-9-]+"
				+ "(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+"
				+ "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
		
		Matcher emailsMatcher = emailsPattern.matcher(inputText);
		
		while (emailsMatcher.find()) {
			System.out.println(emailsMatcher.group());
		}		
	}
}
