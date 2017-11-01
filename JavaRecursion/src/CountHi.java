
public class CountHi {
	/* Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
	*/
	public int countHi(String str) {
		  if(str.length() <= 1) {
		    return 0;
		  }
		  if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
		    return 1 + countHi(str.substring(2));
		  }
		  else {
		    return countHi(str.substring(1));
		  }
	}
}
