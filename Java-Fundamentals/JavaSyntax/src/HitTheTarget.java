import java.util.Scanner;

public class HitTheTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner console = new Scanner(System.in);
        int target = console.nextInt();
 
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if ((i + j) == target) {
                    System.out.println(i + " + " + j + " = " + target);
                } else if ((i >= j) && ((i - j) == target)) {
                    System.out.println(i + " - " + j + " = " + target);
                }
            }
        }
    }
}