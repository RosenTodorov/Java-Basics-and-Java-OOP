import java.util.Scanner;

public class FibonacciRecursion {
// 0, 1, 1, 2, 3, 5, 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number whose fibonacci is to be found: ");
		int n = scanner.nextInt();
		int result = fibonacci(n);
		System.out.print("The fibonacci is " + result);
	}
		
		public static int fibonacci(int n) {
			if (n == 0) {
				return 0;
			}
			else if (n == 1) {
				return 1;
			}
			else {
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}
}
