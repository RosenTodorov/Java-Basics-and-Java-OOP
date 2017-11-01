
public class CountX {
	/* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	 */
	public int countX(String str) {
		  if (str.length() == 0) {
		    return 0;
		  }
		  if (str.charAt(0) == 'x') {
		    return 1 + countX(str.substring(1));
		  }
		  else { 
		    return countX(str.substring(1));
		  }
	}
}
