import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddAndEvenPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] numbers = input.nextLine().split(" ");
		
		List<Integer> inputNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			inputNumbers.add(Integer.parseInt(numbers[i]));
		}
		
		if (inputNumbers.size() % 2 != 0) {
			System.out.print("Invalid length");
			
		} else {	
			
		for (int i = 0; i < inputNumbers.size(); i += 2) {
			if (inputNumbers.get(i) % 2 == 0 && inputNumbers.get(i + 1) % 2 == 0){
				System.out.printf("%1$d, %2$d -> both are even", inputNumbers.get(i), 
						inputNumbers.get(i + 1));
				System.out.println();
			} else if (inputNumbers.get(i) % 2 != 0 && inputNumbers.get(i + 1) % 2 != 0) {
				System.out.printf("%1$d, %2$d -> both are odd", inputNumbers.get(i), 
						inputNumbers.get(i + 1));
				System.out.println();				
			} else {
				System.out.printf("%1$d, %2$d -> different", inputNumbers.get(i), 
						inputNumbers.get(i + 1));
				System.out.println();
			}
		}
	}
}
}
