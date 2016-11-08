import java.util.Scanner;

public class GetFirstOddOrEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] arrayInput = input.nextLine().split(" ");
		String[] commandInput = input.nextLine().split(" ");

		int[] array = new int[arrayInput.length];
		int printWord = Integer.parseInt(commandInput[1]);

		for (int i = 0; i < arrayInput.length; i++) {
			array[i] = Integer.parseInt(arrayInput[i]);
		}

		switch (commandInput[2]) {
		case "odd":
			for (int element : array) {
				if (printWord == 0) {
					break;
				}

				if ((element % 2) != 0) {
					System.out.print(element + " ");
					printWord--;
				}
			}
			break;
		case "even":
			for (int element : array) {
				if (printWord == 0) {
					break;
				}

				if ((element % 2) == 0) {
					System.out.print(element + " ");
					printWord--;
				}
			}
			break;
		default:
			break;
		}
	}
}
