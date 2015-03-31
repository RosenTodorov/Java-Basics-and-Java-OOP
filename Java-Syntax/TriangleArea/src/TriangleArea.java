import java.util.Scanner;

public class TriangleArea {
	/**		
	 * Write a program that enters 3 points in the plane (as integer x and y coordinates),
	 * calculates and prints the area of the triangle composed by these 3 points. 
	 * Round the result to a whole number. In case the three points do not form a triangle, print "0" as result. 
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int aX = scanner.nextInt();
		int aY = scanner.nextInt();
		
		int bX = scanner.nextInt();
		int bY = scanner.nextInt();
		
		int cX = scanner.nextInt();
		int cY = scanner.nextInt();
	
		int ab = cX - aX;
		int bc = bY - cY;
		int ca = bY - aY;
		
		if ((ab + bc)>ca) {
			int area = Math.abs(((aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY))/2));
			System.out.print(area);
		}
		else {
			System.out.print("0");
		}
		
	}

}
