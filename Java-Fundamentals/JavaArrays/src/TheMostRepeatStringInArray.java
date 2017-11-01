
public class TheMostRepeatStringInArray {
	// the most repeat String in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub - n2
		String [] words = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Sunday"};
		int count = 1;
		int maxCount = 0;
		String word = " ";
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if(words[i] == words[j]){
					count++;
				}
				if(count > maxCount) {
					maxCount = count;
					word = words[i];
					count = 0;
				}
			}
		}		
		System.out.println(word);
	}
}



