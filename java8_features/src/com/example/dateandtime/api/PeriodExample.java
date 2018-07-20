package com.example.dateandtime.api;

import java.time.LocalDate;

public class PeriodExample {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current Date"+date);
		
		//Add 1 mnth to the cureent date
		LocalDate date1 = date.plusMonths(1);
		System.out.println(date1);
		
	}

}
