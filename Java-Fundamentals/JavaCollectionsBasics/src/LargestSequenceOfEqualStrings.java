import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
/* Write a program that enters an array of strings and finds
 *  in it the largest sequence of equal elements. If several sequences
 *   have the same longest length, print the leftmost of them.
 *    The input strings are given as a single line, separated by a space. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Plese enter the elements of the array: ");
		String str = input.nextLine();
		
		String[] arrStr = str.split(" ");
		int count = 1;
		int maxCount = 1;
		int index = 0;
		
		for (int i = 1; i < arrStr.length; i++) {
			if (arrStr[i].equals(arrStr[i - 1])) {
				count++;	
			} else {
				count = 1;
			//	equalString += arrStr[i] + " ";
			}	
			if (count > maxCount) {
				maxCount = count;
				index = i - maxCount + 1;
			}	
		}
	for (int i = 0; i < maxCount; i++) {
		System.out.print(arrStr[index] + " ");
	}
}
}
