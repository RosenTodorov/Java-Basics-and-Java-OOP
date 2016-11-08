import java.util.Scanner;

public class PrintCharacterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the high of the triangle: ");
		int number = scanner.nextInt();
        char currentChar = 'a';
		
		for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(currentChar);
                currentChar++;
            }          
        	System.out.println();
        	currentChar = 'a';
        } 
		
		for (int i = 0; i < number; i++) {
			System.out.print(currentChar);
			currentChar++;
		}
		System.out.println();
		
		for (int i = number - 1; i > 0; i--) {
			currentChar = 'a';
			for (int j = i; j > 0; j--) {
				System.out.print(currentChar);
				currentChar++;
			}
			System.out.println();
			currentChar = 'a';
		}
	}
}

