import java.util.Scanner;


public class FactorielMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number whose factorial is to be found: ");
		int n = scanner.nextInt();
		int result = factorial(n);
		System.out.print("The factorial of n is: " + result);	
	}
	
	public static int factorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}
