import java.util.Scanner;

public class SumTwoNumbers {
	/**
	 * Write a program SumTwoNumbers.java that enters two integers from the console, calculates and prints their sum.
	 *  Search in Internet to learn how to read numbers from the console. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int number1 = scan.nextInt();
		System.out.println("Enter your second number");
		int number2 = scan.nextInt();
		
		int sum = number1 + number2;
		System.out.println("The result is: ");
		System.out.println(number1 + " + " + number2 + " = " + sum);
	}

}
