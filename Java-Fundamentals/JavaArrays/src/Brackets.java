import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String brackets = sc.nextLine();
		boolean isBalanced = true;
		for (int i = 0; i < brackets.length(); i++) {
			char bracket = brackets.charAt(i);
			if (bracket == '{'|| bracket == '[' || bracket == '(') {
				stack.push(bracket);
			} else {
				if (bracket == '}') {
					bracket = '{';
				} else if (bracket == ']') {
					bracket = '[';
				} else {
					bracket = '(';
				}
				
				if (stack.isEmpty()) {
					isBalanced = false;
					break;
				}
				
				if (bracket == stack.peek()) {
					stack.pop();
				} else {
					isBalanced = false;
					break;
				}
			}
		}
		
		if (isBalanced) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

