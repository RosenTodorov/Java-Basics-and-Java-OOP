import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday"};		
		/*
		for (int i = strDays.length - 1; i >= 0; i--) {
			System.out.print(strDays[i] + ", ");
		} */
		
		List<String> list = Arrays.asList(strDays);
		
		Collections.reverse(list);
		/*
		for(int i = 0; i < list.size(); i++){
			System.out.println(list);
		} */
		
		strDays = (String[]) list.toArray();
		
		System.out.println("String array reversed");
		
		for (int i = 0; i < strDays.length; i++) {
			System.out.print(strDays[i] + ", ");
		} 
	}
}
