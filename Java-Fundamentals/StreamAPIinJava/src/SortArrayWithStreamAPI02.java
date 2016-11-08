import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortArrayWithStreamAPI02 {
	/*
	 * Use the .sorted() method to sort an array of integers.
	 * The first line of input is the array.
	 * The second is the sorting order.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		List<Integer> inputList = new ArrayList<>();
		String command = scanner.nextLine();
		
		for (int i = 0; i < input.length; i++) {
			inputList.add(Integer.parseInt(input[i]));
		}
		
		if (command.equals("Ascending")) {
			Stream<Integer> number = inputList.stream().sorted(Comparator.naturalOrder());
			number.forEach(e -> System.out.print(e + " "));
		} else {
			Stream<Integer> number = inputList.stream().sorted(Comparator.reverseOrder());
			number.forEach(e -> System.out.print(e + " "));
		}
	}
}
