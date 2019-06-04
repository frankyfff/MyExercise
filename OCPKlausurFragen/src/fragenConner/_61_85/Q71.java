package fragenConner._61_85;

import java.time.LocalTime;

public class Q71 {

	public static void main(String[] args) {
		// Given code fragment:

		LocalTime now = LocalTime.now();
		long timtoBreakfast = 0;
		LocalTime office_start = LocalTime.of(7, 30);
		if (office_start.isAfter(now)) {
			timtoBreakfast = now.until(office_start, MINUTES);
		} else {
			timtoBreakfast = now.until(office_start, HOURS);
		}
		System.out.println(timtoBreakfast);

	}

	/*
	 * Assume that the value of now is 6:30 in the morning.
	 * 
	 * What is the result?
	 * 
	 * A. An exception is thrown at run time. 
	 * 
	 * B. 0 
	 * 
	 * C. 60 
	 * 
	 * D. 1 
	 * 
	 * 
	 * 
	 * 
	 * Correct Answer: C
	 * 
	 * 
	 */

}
