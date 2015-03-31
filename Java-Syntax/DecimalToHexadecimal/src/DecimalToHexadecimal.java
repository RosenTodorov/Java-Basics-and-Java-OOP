import java.util.Scanner;

public class DecimalToHexadecimal {
	/**
	 * Write a program that enters a positive integer number num and converts and prints it in hexadecimal form.
	 * You may use some built-in method from the standard Java libraries.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.print(Integer.toHexString(num).toUpperCase());
	}
}
