import java.util.Scanner;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Your string is: ");
		String word = input.nextLine();
		System.out.print(reverseStr(word));		
		}
		
		public static String reverseStr(String word) {       	
		if (word == null) {
			return word;
		} 
		else if (word.length() <= 1) {
			return word;
		} 
		else {
			return reverseStr(word.substring(1)) + word.charAt(0);
		}		
	/*	reverse("Hello")
		(reverse("ello")) + "H"
		((reverse("llo")) + "e") + "H"
		(((reverse("lo")) + "l") + "e") + "H"
		((((reverse("o")) + "l") + "l") + "e") + "H"
		(((("o") + "l") + "l") + "e") + "H"
		"olleH"  */
	}
}
