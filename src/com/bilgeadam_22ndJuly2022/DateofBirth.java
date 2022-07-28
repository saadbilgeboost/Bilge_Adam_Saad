package com.bilgeadam_22ndJuly2022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateofBirth {

	public static void main(String[] args) {
		LocalDate dateofBirth = LocalDate.of(1993, 4, 18);
		LocalDate todayDate = LocalDate.of(2022, 7, 22);
		long yearsLived = dateofBirth.until(todayDate, ChronoUnit.YEARS);
		System.out.println("Years Lived: " + yearsLived);
		long monthsLived = dateofBirth.until(todayDate, ChronoUnit.MONTHS);
		System.out.println("Months lived: " + monthsLived);
		long daysLived = dateofBirth.until(todayDate, ChronoUnit.DAYS);
		System.out.println("Days lived: " + daysLived);
		LocalDate nextBirthdayDate = dateofBirth.plusYears(yearsLived + 1);
		System.out.println(nextBirthdayDate);

	}

}
