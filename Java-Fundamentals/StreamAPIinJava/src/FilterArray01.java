import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray01 {
	/* Write a program that filters an array of strings, leaving only the strings with length 
	 * greater than 3 characters. 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] elements = scanner.nextLine().split(" ");
		
		List<String> names = new ArrayList();
		
		for (int i = 0; i < elements.length; i++) {
			names.add(elements[i]);
		}
		
	    names.stream()
	    .filter(n -> n.length() > 3)
	    .forEach(e -> System.out.print(e + " "));
	}
}
