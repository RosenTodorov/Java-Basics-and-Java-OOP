import java.util.Scanner;

public class StringMatch {
	/* Given 2 strings, a and b, return the number of the positions where they contain 
	 * the same length 2 substring.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputOne = scanner.nextLine();
		String inputTwo = scanner.nextLine();
		System.out.println(stringMatch(inputOne, inputTwo));
	}
	
	public static int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int count = 0;
		for (int i = 0; i < len-1; i++) {
			String subA = a.substring(i, i+2);
			String subB = b.substring(i, i+2);
			
			if (subA.equals(subB)) {
				count++;
			}
		}
		return count;
		
	}

}
