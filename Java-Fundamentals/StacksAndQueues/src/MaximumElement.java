import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
/*	You have an empty sequence, and you will be given N queries. Each query is one of these three types:
		1 x - Push the element x into the stack.
		2    - Delete the element present at the top of the stack.
		3    - Print the maximum element in the stack. */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int commandCount = input.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < commandCount; i++) {
			int command = input.nextInt();
			if (command == 1) {
			int numToPush = input.nextInt();
			stack.push(numToPush);
		} else if (command == 2) {
			stack.pop();
		} else {
			int maxNumber = Integer.MIN_VALUE;
			for (Integer num : stack) {
				if (num > maxNumber) {
					maxNumber = num;
				}
			}
			System.out.println(maxNumber);
		}		
		}
	}
}
