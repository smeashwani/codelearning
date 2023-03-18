package codelearning.basic.DateAndTime;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        System.out.println("The Current Date is:" + calendar.getTime());// Tue Aug 28 11:10:40 UTC 2018
        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
 	   calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());

	}

}
