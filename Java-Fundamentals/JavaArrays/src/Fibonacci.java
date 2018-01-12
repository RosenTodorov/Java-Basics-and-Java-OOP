import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    long number = scanner.nextLong();
		long x = 0;
		long y = 1;
		
		System.out.print("The numbers are: ");
		
		for(int i = 0; i < number; i++) {
			System.out.print(x + ", ");
			long temp = y;
			y = x + y;
			x = temp;		
		}
		System.out.print("The sum is :" + x);
	}
}
