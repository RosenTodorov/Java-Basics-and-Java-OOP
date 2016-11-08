import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number whose factorial is to be found: ");
		int n = scanner.nextInt();
		int result = factorial(n);
		System.out.print("The factorial is " + result);			
	}
	
		public static int factorial(int n) {
			if (n == 0) {
				return 1;
			} else {
				return n * factorial(n - 1);
			}
		}
	}

