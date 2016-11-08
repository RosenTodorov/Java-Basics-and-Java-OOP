import java.util.Locale;
import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "EN"));
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] arrStr = input.split("\\W+");
		
		System.out.println(arrStr.length);
	}
}
