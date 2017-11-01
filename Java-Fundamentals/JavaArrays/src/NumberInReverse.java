import java.util.Scanner;

public class NumberInReverse {
	//Write a method that reverses the digits of given decimal number. Example: 256  652
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	
	int reverseNumber = 0;
	int temp = 0;
	
	while (number > 0){
		temp = number % 10;
		reverseNumber = reverseNumber*10 + temp;
		number = number/10;		
	}
	
	System.out.println("Reversed Number is: " + reverseNumber);
}
}
