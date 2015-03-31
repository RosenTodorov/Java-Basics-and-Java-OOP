import java.util.Scanner;

public class CountOfBitsOne {
	/**
	 * Write a program to calculate the count of bits 1 in the binary
	 * representation of given integer number n
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char[] arr = Integer.toBinaryString(num).toCharArray();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				count++;
			}
		}
		
		System.out.print(count);
	}
}
