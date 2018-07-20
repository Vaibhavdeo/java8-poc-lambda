package com.example.dateandtime.api;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {
	
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		/*
		 * HRS - 0-23
		 * Mins 0-59
		 * secs 0-59
		 */
		LocalTime time2 = LocalTime.of(15, 59);
		System.out.println("Current Time"+time2);
		
		int minute = time.getMinute();
		int seconds = time.getSecond();
		int hrs = time.getHour();
		
		System.out.println("Minutes "+minute);
		System.out.println("seconds "+seconds);
		System.out.println("Hrs "+hrs);
		
		//Option2
		int min = time.get(ChronoField.MINUTE_OF_DAY);
		int hr = time.get(ChronoField.HOUR_OF_DAY);
		int sec = time.get(ChronoField.SECOND_OF_DAY);
		
		System.out.println("Minutes "+min);
		System.out.println("seconds "+sec);
		System.out.println("Hrs "+hr);
		
		//Alteration of date in current date using with keyword
		
		
		
		
		
	}

}
