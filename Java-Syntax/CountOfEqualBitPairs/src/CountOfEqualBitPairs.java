import java.util.Scanner;

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		/**
		 * Write a program to count how many sequences of two equal bits ("00" or "11") can be found 
		 * in the binary representation of given integer number n (with overlapping).
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = scan.nextInt();
		char[] binary = Integer.toBinaryString(num).toCharArray();
		int count = 0;
		
		for (int i = 0; i < binary.length-1; i++) {
			if (binary[i]==binary[i+1]) {
				count++;
			}
		}
		System.out.print("Equal bits: ");
		System.out.print(count);

	}

}
