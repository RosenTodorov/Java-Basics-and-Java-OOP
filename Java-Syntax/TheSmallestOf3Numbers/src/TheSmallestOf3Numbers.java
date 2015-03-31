import java.util.Scanner;

public class TheSmallestOf3Numbers {
	/**
	 * Write a program that finds the smallest of three numbers. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		int firstN = scan.nextInt();
		int secondN = scan.nextInt();
		int thirdN = scan.nextInt();
		
		System.out.print("The min sum is: ");
		System.out.print(Math.min(firstN, Math.min(secondN, thirdN)));
	}
}
