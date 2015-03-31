import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineListOfLetters {
	/*
	 * Write a program that reads two lists of letters l1 and l2 and combines them: 
	 * appends all letters c from l2 to the end of l1, but only when c does not appear in l1.
	 * Print the obtained combined list. 
	 * All lists are given as sequence of letters separated by a single space, each at a separate line.
	 * Use ArrayList<Character> of chars to keep the input and output lists
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Character> firstList = new ArrayList<>();
		List<Character> secondList = new ArrayList<>();
		List<Character> allTogether = new ArrayList<>();
		
		for (char ch : scan.nextLine().toCharArray()) {
			firstList.add(ch);
		}
		
		for (char ch : scan.nextLine().toCharArray()) {
			secondList.add(ch);
		}
		
		allTogether.addAll(firstList);
		
		for (int i = 0; i < secondList.size(); i++) {
			if (firstList.contains(secondList.get(i))) {
				continue;
			} 
			else {
				allTogether.add(' ');
				allTogether.add(secondList.get(i));
			}
		}
		
		for (char ch : allTogether) {
			System.out.print(ch);
		}
	}
}
