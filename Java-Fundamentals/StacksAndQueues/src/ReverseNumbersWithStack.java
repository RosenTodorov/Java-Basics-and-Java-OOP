import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbersWithStack {
	/* Write a program that reads N integers from the console and reverses them using a stack.
	 *  Use the Stack<Integer> class.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int commantCount = Integer.valueOf(input.nextLine());
		int[] array = new int[commantCount];
		Stack<Integer> stack = new Stack<>();
	
		
		for(int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} 
		
		/* second way with second stack where we save our max numbers
		Scanner sc = new Scanner(System.in);
		int commandCount = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> maxStack = new Stack<>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < commandCount; i++) {
			int command = sc.nextInt();
			if (command == 1) {
				int numToPush = sc.nextInt();
				stack.push(numToPush);
				if (max <= numToPush) {
					max = numToPush;
					maxStack.push(max);
				}
			} else if (command == 2) {
				int poppedItem = stack.pop();
				if (poppedItem == max) {
					maxStack.pop();
					if (maxStack.size() > 0) {
						max = maxStack.peek();
					} else {
						max = Integer.MIN_VALUE;
					}
				}
			} else {
				System.out.println(max);
			}
		}	*/
	}
}

