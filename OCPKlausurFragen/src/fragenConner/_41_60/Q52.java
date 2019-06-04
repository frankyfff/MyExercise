package fragenConner._41_60;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

//Given code fragment:


public class Q52 {

	public static void main(String[] args) {
		// Given code fragment:
		
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneID.of("UTC-7")); 
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneID.of("UTC-5"));
		long hrs = ChronoUnit.HOURS.between(depart, arrive); //linen1
		System.out.println("Travel time is" + hrs + "hours");

	}
	
	/**
	 * 
	 * A.	Travel time is 4 hours
	 * B.	Travel time is 6 hours
	 * C.	Travel time is 8 hours
	 * D.	An exception is thrown at line n1.
	 * 
	 * 
	 * Correct Answer: A
	 * 
	 */

}
