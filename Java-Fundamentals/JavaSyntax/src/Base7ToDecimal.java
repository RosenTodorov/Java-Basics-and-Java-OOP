import java.util.Scanner;

public class Base7ToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		char[] chars = scanner.nextLine().toCharArray();
		
		int[] reverse = new int[chars.length];
		
		for(int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = Integer.parseInt(String.valueOf(chars[i]));		
		}	
		for (int i = 0; i < reverse.length; i++) {
			 
            int sum = (int) (reverse[i] * Math.pow(7, i));
 
            result += sum;
        }
        System.out.println(result);
    }
}