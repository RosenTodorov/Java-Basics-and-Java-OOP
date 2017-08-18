import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Permutations {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		String word = input.nextLine();
		System.out.println(permutation(word));
	}
	/**
	 * List permutation of a string
	 * 
	 * @param s the input string
	 * @return  the list of permutation
	 */
	
	public static ArrayList<String> permutation(String str) {
		ArrayList<String> res = new ArrayList<String>();
	    // If input string's length is 1, return {s}
		if (str.length() == 1){
		   res.add(str);
		}
		else if (str.length() > 1) {
			int lastIndex = str.length() - 1;
		    // Find out the last character
			String lastChar = str.substring(lastIndex);
			// Rest of the string
			String restChars = str.substring(0, lastIndex);
		    // Perform permutation on the rest string and
	        // merge with the last character
			res = merge(permutation(restChars), lastChar);
		}	
		return res;
	}
	
	/**
	 * @param list a result of permutation, e.g. {"ab", "ba"}
	 * @param c    the last character
	 * @return     a merged new list, e.g. {"cab", "acb" ... }
	 */
	public static ArrayList<String> merge(ArrayList<String> list, String lastChar) {
		ArrayList<String> res = new ArrayList<String>();
		// Loop through all the string in the list
		for (String word : list) {
			// For each string, insert the last character to all possible postions
	        // and add them to the new list
			for (int i = 0; i <= word.length(); ++i){
				String result = new StringBuffer(word).insert(i, lastChar).toString();
				res.add(result);
			}
		}
		return res;
	}
}
