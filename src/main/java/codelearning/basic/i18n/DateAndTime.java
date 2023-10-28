package codelearning.basic.i18n;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.FRANCE);
		
		
		printTime(Locale.UK);
		printTime(Locale.US);
		printTime(Locale.FRANCE);

	}

	static void printDate(Locale locale) {
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String date = formatter.format(currentDate);
		System.out.println(date + " " + locale);
	}

	static void printTime(Locale locale) {
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String time = formatter.format(currentDate);
		System.out.println(time + " in locale " + locale);
	}
}
