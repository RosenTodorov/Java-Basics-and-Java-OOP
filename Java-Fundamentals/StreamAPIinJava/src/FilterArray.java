import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArray {
/* Write a program that filters an array of strings, finds the numbers in it, and maps them to a list 
 * of integers. Sum all the integers and print the resul:
 * Banica 12 gosho j1k 33 kl bozichka 81 88kl 5562 abcd 8 I te taka -> 5696
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] elements = scanner.nextLine().split(" ");
		
		//Arrays.stream(elements);
		
		List<Integer> numbers = Arrays.stream(elements)
				.filter(StreamAPI::isNumber)
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		int sumAnotherWay = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		int sumReduce = numbers.stream().reduce((x, y) -> x + y).get();
				
		System.out.println(sum);
		System.out.println(sumAnotherWay);
		System.out.println(sumReduce);
	}
	
	public static class StreamAPI {
		private static boolean isNumber (String str) {
			for (char ch : str.toCharArray()) {
				if (!Character.isDigit(ch)) {
					return false;
				}
			}
			
			return true;
		}	
	}
}

