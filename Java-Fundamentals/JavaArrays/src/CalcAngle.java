import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CalcAngle {
	
	static double calculateAngle(double hour, double minute) {
		if (hour < 0 || minute < 0 || hour > 12 || minute > 60) {
			System.out.println("Wrong input");
		}
		if (hour == 12) {
			hour = 0;
		}
		if (minute == 60) {
			minute = 0;
		}
		// the minute hand moves 360 degree in 60 minute(or 6 degree in one minute) 
		double degreePerMinute = 360/60; // -> 6
		// hour hand moves 360 degree in 12 hours
		double degreePerHour = 360/12; // -> 30
		// kolko e izmenenieto na malkata strelka pri dvijenie na golqmata -> 0.5 
		double hourDegreePerMinute = degreePerHour/60; // 0.5 (or 0.5 degree in 1 minute)
		
		double hourAngle = hourDegreePerMinute * (hour * 60 + minute);
		double minuteAngle = degreePerMinute * minute;
		
		// Find the difference between two angles
		double angle = Math.abs(hourAngle - minuteAngle);
		
		// Return the smaller angle of two possible angles
		angle = Math.min(360 - angle, angle);
		
		return angle;
	}
	
		public static void main(String[] args) {
			System.out.print(calculateAngle(12.0, 30.0));
	}
}

	
