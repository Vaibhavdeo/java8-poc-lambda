package com.example.dateandtime.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormattingExample {
	
	public static void main(String[] args) {
		
	
	LocalDate date = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy E");
	String fDate = date.format(formatter);
	System.out.println("Date "+date);
	System.out.println("FormattedDate "+fDate);
	
	}

}
