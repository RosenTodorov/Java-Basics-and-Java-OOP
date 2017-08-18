import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="AliveisAwesome";
		StringBuilder word = new StringBuilder();
		word.append(input);
		word = word.reverse();
		
		System.out.println(word);
		
		for (int i = 0; i < word.length(); i++){
			System.out.print(word.charAt(i)); 		
		}
		
		// second way
		System.out.println();
		for (int i = input.length() - 1; i >= 0; i--){
			System.out.print(input.charAt(i));
		} 
		
		// third way
		System.out.println();
		char[] chars = input.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
	}
}
