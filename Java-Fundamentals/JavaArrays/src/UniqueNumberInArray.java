import java.util.HashSet;
import java.util.Set;

public class UniqueNumberInArray {
 // [1, 73, 12, - 5, 73, - 5, 1, 12, 8] -> 8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = new Integer[] {1, 73, 12, - 5, 73, 8, - 5, 1, 12};
	
		Set<Integer> equalNumbers = new HashSet<Integer>();
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		String uniqueNumber = "";
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
			if (numbers[i] == numbers[j]) {
				if (!equalNumbers.contains(numbers[j])) {
					equalNumbers.add(numbers[j]);	// 1, -5, 73, 12,
				}
			}
			else {
				if (!uniqueNumbers.contains(numbers[j]))
				uniqueNumbers.add(numbers[j]);	 // 1, -5, 8, 73, 12, 		
			}
			}
		}
				
		for (Integer number : equalNumbers) {
			System.out.print(number.toString() + ", "); // 1, -5, 73, 12,
		}	
		System.out.println();		
		for (Integer number : uniqueNumbers) {
			System.out.print(number.toString() + ", "); // 1, -5, 8, 73, 12, 
		} 
		
		for (Integer number : uniqueNumbers) {
			if (!equalNumbers.contains(number)) {
				uniqueNumber += number;
			}
		}
		System.out.println();	
        System.out.println("The uniqie number is : " + uniqueNumber);
	}
}
	
	/* second variant
	 	Integer[] numbers = new Integer[] {1, 73, 12, - 5, 73, 8, - 5, 1, 12};
		Set<Integer> unequalNumbers = new HashSet<Integer>();
		Set<Integer> equalNumbers = new HashSet<Integer>();
		int unequalNumber = numbers[0];
			
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] != numbers[j]) {
					unequalNumbers.add(numbers[j]);
				} else {
					equalNumbers.add(numbers[j]);
				}
			}
		}
		
		for(Integer number : unequalNumbers){
			if(!equalNumbers.contains(number)) {
				unequalNumber = number;
			}		
		}
		System.out.println(unequalNumber);
		*/
	

