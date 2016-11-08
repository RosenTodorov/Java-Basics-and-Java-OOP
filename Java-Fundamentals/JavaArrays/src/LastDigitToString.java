import java.util.Scanner;


public class LastDigitToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		PrintLastDigitToString(number);
	}
	
	static void PrintLastDigitToString(int number) {
		int lastDigit = Math.abs(number % 10);
		
		switch(lastDigit) {
		case 0: System.out.printf("{0}--> zero", number); break;
		case 1: System.out.printf("{1}--> one", number); break;
		case 2: System.out.printf("{2}--> two", number); break;
		case 3: System.out.printf("{3}--> three", number); break;
		case 4: System.out.printf("{4}--> four", number); break;
		case 5: System.out.printf("{5}--> five", number); break;
		case 6: System.out.printf("{6}--> six", number); break;
		case 7: System.out.printf("{7}--> seven", number); break;
		case 8: System.out.printf("{8}--> eight", number); break;
		case 9: System.out.printf("{9}--> nine", number); break;
		}	
	}
}
