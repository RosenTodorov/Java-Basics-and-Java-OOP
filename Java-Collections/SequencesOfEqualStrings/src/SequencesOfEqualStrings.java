import java.util.Scanner;

public class SequencesOfEqualStrings {
	/**
	 * Write a program that enters an array of strings and finds in it all sequences of equal elements. 
	 * The input strings are given as a single line, separated by a space. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String words = scan.nextLine();
		String[] split = words.split(" ");
		
		System.out.print(split[0]);
		for (int i = 1; i < split.length; i++) {
			if (split[i].equals(split[i - 1])) {
				System.out.print(" " + split[i]);
			}
			else {
				System.out.print("\n" + split[i]);
			}
			scan.close();
		}
	}
}
