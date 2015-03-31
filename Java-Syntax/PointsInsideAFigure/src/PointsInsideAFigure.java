import java.util.Scanner;

public class PointsInsideAFigure {
	/**
	 * Write a program to check whether a point is inside or outside of the figure below. 
	 * The point is given as a pair of floating-point numbers, separated by a space. 
	 * Your program should print "Inside" or "Outside". 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		float a = Float.parseFloat(arr[0]);
		float b = Float.parseFloat(arr[1]);
		
		if (((b <= 13.5) && (b >= 6)) && (a >= 12.5) && (a <= 22.5)) {
			if (((b > 13.5) && (b < 8.5)) && (a > 17.5) && (a < 20)){
				System.out.print("Outside");
			}
			else {
				System.out.print("Inside");
			}
		}
		else {
			System.out.print("Outside");
		}
	}
}
