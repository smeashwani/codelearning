package codelearning.basic.DateAndTime;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Simple {
	public static void main(String[] args) {
		//Get the current date
	      Date currentDate = new Date();
	      System.out.println("Current date: " + currentDate);
			
	      //Get the instant of current date in terms of milliseconds
	      Instant now1 = currentDate.toInstant();
	      System.out.println(now1);
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println(currentZone);

	long milliSeconds = System.currentTimeMillis();
	System.out.println(milliSeconds); // showing in milli seconds //1653924927831
	Instant now = Instant.now();
	System.out.println(now.getEpochSecond()); // showing in nano seconds //1653924927
	}
}
