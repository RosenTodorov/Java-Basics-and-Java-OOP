import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
	/**
	 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a floating-point c
	 * and prints them in 4 virtual columns on the console. Each column should have a width of 10 characters. 
	 * The number a should be printed in hexadecimal, left aligned; then the number a should be printed in binary form, 
	 * padded with zeroes, then the number b should be printed with 2 digits after the decimal point, right aligned; 
	 * the number c should be printed with 3 digits after the decimal point, left aligned.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.GERMAN); 
		int a = scan.nextInt();		
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		String str = Integer.toBinaryString(a);
		
		System.out.print(String.format("|%-10s|%010d|%10.2f|%-10.3f|", Integer.toHexString(a).toUpperCase(), Integer.parseInt(str), b, c));
	}

}
