import java.util.Scanner;


public class SequencesOfEqualStrings {
/* Write a program that enters an array of strings and finds in it all
 *  sequences of equal elements. The input strings are given as a single line, separated by a space. 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        String[] arrStr = str.split(" ");
        
        System.out.print(arrStr[0]);
        for (int i = 1; i < arrStr.length; i++) {
        	if (arrStr[i].equals(arrStr[i - 1])) {
        		System.out.print(" " + arrStr[i]);
        	} else {
        		System.out.println();
        		System.out.print(arrStr[i]);
        	}
        }	
	}
}
