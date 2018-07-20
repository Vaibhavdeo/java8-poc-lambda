package com.example.dateandtime.api;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocaldateExample1 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate yesterday = date.minusDays(1);

		LocalDate tomorrowDate = date.plusDays(1);

		System.out.println("Today" + date);
		System.out.println("Yesterday" + yesterday);
		System.out.println("Tomorrow" + tomorrowDate);

		// Obtains an instance
		LocalDate date1 = LocalDate.of(2018, 5, 4);
		System.out.println("Date1" + date1);

		LocalDate date2 = LocalDate.of(2018, Month.SEPTEMBER, 4);
		System.out.println("Date1" + date2);

		int day = date.getDayOfMonth();
		System.out.println("Todays Day" + day);

		day = date.get(ChronoField.DAY_OF_MONTH);
		System.out.println("Todays Day" + day);
		
		
	}

}
