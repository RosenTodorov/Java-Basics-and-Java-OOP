import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class DaysBetweenTwoDates {
	/**
	 * Write a program to calculate the difference between two dates in number of days. 
	 * The dates are entered at two consecutive lines in format day-month-year. 
	 * Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100]. 
	 * @param <DateTime>
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstDate = scan.next();
		String secondDate = scan.next();
		
		String[] dateFirst = firstDate.split("-");
		String[] dateSecond = secondDate.split("-");
		
		int yearFirst = Integer.parseInt(dateFirst[2]);
		int monthFirst = Integer.parseInt(dateFirst[1]);
		int dayFirst = Integer.parseInt(dateFirst[0]);
		
		int yearSecond = Integer.parseInt(dateSecond[2]);
		int monthSecond = Integer.parseInt(dateSecond[1]);
		int daySecond = Integer.parseInt(dateSecond[0]);
		
		DateTime past = new DateTime(yearFirst, monthFirst, dayFirst, 0, 0);
		DateTime today = new DateTime(yearSecond, monthSecond, daySecond, 0,0); 
		int days = Days.daysBetween(past, today).getDays();
		
		System.out.print(days);
	}
}
