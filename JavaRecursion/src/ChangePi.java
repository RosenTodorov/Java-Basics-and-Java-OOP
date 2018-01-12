
public class ChangePi {
/* Given a string, compute recursively (no loops) a new string where all appearances of "pi" 
 * have been replaced by "3.14". 
 * */	
	public String changePi(String str) {
		  if(str.length() <= 1) {
		    return str;
		  }
		  if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
		    return "3.14" + changePi(str.substring(2));
		  }
		  else {
		    return str.charAt(0) + changePi(str.substring(1));
		  }
	}
}
