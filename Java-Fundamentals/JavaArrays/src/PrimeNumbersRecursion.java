import java.util.Scanner;


public class PrimeNumbersRecursion {
//Printing prime numbers in Java using recursion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
			for (int i = 2; i <= input; i++) {
				/* 
				 int temp = input % i;
	             if(temp == 0)
	             {
	                isPrime = false;
	                break;
 	             }
				 */
			int result = primeRecur(i, i - 1);
			if (result == 1) {
				System.out.println(i + " is a prime number");
			}
		}		
	}
	
    public static int primeRecur(int number, int div) {
		if (div == 1) {
			return 1;
		}
		if (number % div == 0) {
			return 0;
		}
		else {
			return primeRecur(number, div - 1);
		}
	} 
} 