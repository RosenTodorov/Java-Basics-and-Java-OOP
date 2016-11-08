import java.lang.Math;
import java.util.Scanner;

public class CalculateExpression {
	/*
	 * Write a program that reads three floating point numbers from the console
	 * and calculates their result with the following formulae: ((a2 + b2) / (a2
	 * – b2))(a + b + c) / √c (a2 + b2 - c3)(a – b)
	 */

	public static double first(double a) {
		return a * a;
	}

	public static double second(double b) {
		return b * b;
	}

	public static double third(double a, double b, double c) {
		return (a + b + c);
	}

	public static double four(double c) {
		return Math.sqrt(c);
	}

	public static double fifth(double a, double b) {
		return first(a) + second(b);
	}

	public static double sixth(double a, double b) {
		return first(a) - second(b);
	}

	public static double seventh(double a, double b, double c) {
		return third(a, b, c) / four(c);
	}

	public static double eighth(double a, double b) {
		return fifth(a, b) / sixth(a, b);
	}

	public static double f1(double a, double b, double c) {
		return Math.pow(eighth(a, b), seventh(a, b, c));
	}

	// Method for second form

	public static double first1(double a) {
		return a * a;
	}

	public static double third3(double c) {
		return c * c * c;
	}

	public static double fourth(double a, double b, double c) {
		return first1(a) + second(b) - third3(c);
	}

	public static double fifth2(double a, double b) {
		return a - b;
	}

	public static double f2(double a, double b, double c) {
		return Math.pow(fourth(a, b, c), fifth2(a, b));
	}

	public static double resultF1F2(double a, double b, double c) {
		return (f1(a, b, c) + f2(a, b, c)) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextDouble();
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter c: ");
		double c = scan.nextDouble();
		System.out.println();
		System.out.print("Result f1:");
		System.out.println(f1(a, b, c));
		System.out.println();
		System.out.print("Result f2: ");
		System.out.println((f2(a, b, c)));
		System.out.println();

		System.out.print("The average of (a,b,c) is : ");
		double averageABC = (a + b + c) / 3;
		System.out.println(averageABC);

		System.out.println();

		System.out.print("The average of f1 nad f2 : ");
		double averageF1F2 = resultF1F2(a, b, c);
		System.out.println(averageF1F2);
	}
}
