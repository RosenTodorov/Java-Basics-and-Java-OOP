import java.util.Scanner;

public class RectangleArea {
	/**
	 * Write a program that enters the sides of a rectangle (two integers a and b) 
	 * and calculates and prints the rectangle's area.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter b: ");
		int b = scanner.nextInt();
		
		int result = a * b;
		
		System.out.print("The area is: ");
		System.out.println(result);
	}
}
