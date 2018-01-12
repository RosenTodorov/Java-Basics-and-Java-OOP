
public class IntegerDivision {
// return x / y without using '/' (division) or '*' (multiplication) operators: 7 / 2 = 3; 5 / 4 = 1; 1 / 3 = 0;
	public static void main(String[] args) {
    // 7 / 2 = 3
	System.out.println("Inefficient solution: " + intDivide(7, 2));
	System.out.println("With bit shift operators: " + integerDivide(7, 2));
	}
	
	// inefficient solution
	public static int intDivide(int number, int divisor) {
		int count = 0;
		int sum = divisor;
		while (sum <= number) { // 3 pati delitelq e po-malak ili raven ot chisloto
			sum = sum + divisor; 
			count++;			
		}
		return count; // 3
	}
	
	// we can use the bit shift operators '<<' and '>>' to multiply and divide
	public static int integerDivide(int number, int divisor) {
    // we will return -1 if the divisior is '0'
		if (divisor == 0) {
			return -1;
		}
		
		if (number < divisor) {
			return 0;
		}
		else if (number == divisor) {
			return 1;
		}
		else if (divisor == 1) {
			return number;
		}
		
		int count = 1;
		int sum = divisor;
		while (sum < number) {
			sum <<= 1; // we can also use: sum = sum + sum
			count <<= 1; // we can also use: count = count + count;
		}
		
		if (sum > number) {
			sum >>= 1;
			count >>= 1;
			
		return count + integerDivide(number - sum, divisor);
		}
		
	return count;
	}
}

