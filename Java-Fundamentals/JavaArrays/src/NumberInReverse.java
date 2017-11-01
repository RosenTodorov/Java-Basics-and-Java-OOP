import java.util.Scanner;

public class NumberInReverse {
	//Write a method that reverses the digits of given decimal number. Example: 256  652
	public static void main(String[] args) {	
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
   // reverseNumber(number);
    
	int reverseNumber = 0;
	int temp = 0;
	
	while (number > 0){
		temp = number % 10;
		reverseNumber = reverseNumber*10 + temp;
		number = number/10;		
	}
	System.out.println("Reversed Number is: " + reverseNumber); 
}
	/*	with recursion
	public static void reverseNumber(int number) {
	if (number < 10) {
		System.out.println(number);
		return;
	}
	else {
	    System.out.print(number % 10);
		reverseNumber(number/10);
	}
	} */
}
