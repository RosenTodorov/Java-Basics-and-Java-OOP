import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrangeIntegers {
	// da podredim masiv ot 4isla vav vazhodq6t red kato gi prevarnem v dumi
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String[] inputNumbers = console.nextLine().split("\\D+");
		String[] digitToEnglish = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        TreeMap<String, List<String>> englishWordToNumber = new TreeMap<>(); // za da mojem da gi sortirame vav vazhodq6t red zatova ThreeMap
        /*for (int i = 0; i < digitToEnglish.length; i++) {
        	String s = digitToEnglish[i]; */
        for (String inputNumber : inputNumbers) {
        	StringBuilder sb = new StringBuilder();
        	for (char character : inputNumber.toCharArray()) {
        		sb.append(digitToEnglish[Character.getNumericValue(character)]);
        	}
        	if (!englishWordToNumber.containsKey(sb.toString())) {
        		englishWordToNumber.put(sb.toString(), new ArrayList<>());
        	}
        	englishWordToNumber.get(sb.toString()).add(inputNumber);
        }
        
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : englishWordToNumber.entrySet()) { //kolekcia ot key-value pairs
        	for (String digit : entry.getValue()) {
        		sb.append(digit + ", ");
        	}
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
	}
}
