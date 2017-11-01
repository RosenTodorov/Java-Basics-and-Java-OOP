import java.util.Scanner;

public class IsPalindrome {
//Easiest way to check if a string is palindrome [duplicate]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(isPalindrome(input));
	}
	
	public static boolean isPalindrome(String word) {
		int n = word.length();
	//	boolean isPalindrome = true;
		for (int i = 0; i < n-1; i++) {
			if (word.charAt(i) != word.charAt(n-i-1)){
				return false;
			}
		}
		return true;		
	}

}
