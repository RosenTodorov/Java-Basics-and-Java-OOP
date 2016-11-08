
public class PrintCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'z'; i++){
		System.out.print(i + ",");
		}	
	}
		public static String TrimEnd(String input, String charsToTrim){
			return input.replaceAll("[" + charsToTrim + "]+$", "");		
		}	
	}

