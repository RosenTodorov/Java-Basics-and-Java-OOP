import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class RandomizeNumbersFromNToM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int minNumber = 0;
		int maxNumber = 0;
		
		if (n > m) {
			n = maxNumber;
			m = minNumber;
			
		} else if (n < m) {
			n = minNumber;
			m = maxNumber;
			
		} else {
			System.out.println(n);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = minNumber; i <= maxNumber; i--) {
			numbers.add(i);
			Collections.shuffle(numbers); //Randomly permutes the specified list using a default source of randomness.
		}
		for (int item : numbers) {
			System.out.println(item);
		}
	}
}
