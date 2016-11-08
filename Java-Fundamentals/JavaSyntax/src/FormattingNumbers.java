import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		double secondNumber = scanner.nextDouble();
		double thirdNumber = scanner.nextDouble();
		
		String numberInHex = Integer.toHexString(firstNumber).toUpperCase();
	  //String numberInBinary = String.format("%10s",Integer.toBinaryString(firstNumber)).replace(' ', '0');
		int numberInBinary = Integer.parseInt(Integer.toBinaryString(firstNumber));
		
		// we check whether the third number is integer or float
		if (thirdNumber % 1 == 0) {
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f|", numberInHex, numberInBinary,
					secondNumber, thirdNumber);
		}
		else {
			System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", numberInHex, numberInBinary,
					secondNumber, thirdNumber);
		}
	}
}
