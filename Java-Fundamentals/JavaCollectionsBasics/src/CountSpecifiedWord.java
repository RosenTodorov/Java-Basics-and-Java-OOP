import java.util.Scanner;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		String searchWord = scanner.nextLine();
		
		String[] input = text.split("\\W");
		
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].toLowerCase().equals(searchWord)) {
				count++;
			}
		}
		System.out.print(count);
	}
}
