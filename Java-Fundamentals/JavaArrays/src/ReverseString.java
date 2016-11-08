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
		
		for (int i = 0; i < word.length(); i++){
			System.out.print(word.charAt(i)); 		
		}
		/* second way
		for (int i = input.length() - 1; i >= 0; i--){
			System.out.print(input.charAt(i));
		} */
	}
}
