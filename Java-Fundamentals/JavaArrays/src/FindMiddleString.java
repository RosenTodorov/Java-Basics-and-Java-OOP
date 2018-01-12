
public class FindMiddleString {
// find the middle string: A --> A; AB --> AB; ABC --> B; ABCD --> BC;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("A       --> " + getMiddleString("A"));
	      System.out.println("AB      --> " + getMiddleString("AB"));
	      System.out.println("ABC     --> " + getMiddleString("ABC"));
	      System.out.println("ABCD    --> " + getMiddleString("ABCD"));
	      System.out.println("ABCDE   --> " + getMiddleString("ABCDE"));
	      System.out.println("ABCDEF  --> " + getMiddleString("ABCDEF"));
	      System.out.println("ABCDEFG --> " + getMiddleString("ABCDEFG"));
	   }
	   private static String getMiddleString(String str) {
	   
	   if (str.length() <= 2) {
		   return str;
	   }
	   
	   int beginIndex = (str.length() - 1) / 2;
	   int endIndex = (str.length() - 1) / 2 + 2 - (str.length() % 2);
	   
	   return str.substring(beginIndex, endIndex); // -1
	}
}
