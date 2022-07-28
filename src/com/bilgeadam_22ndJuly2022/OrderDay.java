package com.bilgeadam_22ndJuly2022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OrderDay {

	public static void main(String[] args) {

		LocalDate shoppingDate = LocalDate.of(2022, 07, 22);
		LocalDate invoiceDate = LocalDate.of(shoppingDate.getYear(), shoppingDate.getMonthValue(), 15);
		System.out.println(invoiceDate);
		if (shoppingDate.isBefore(invoiceDate)) {
			System.out.println("Before");
		} else {
			invoiceDate = invoiceDate.plusMonths(1);
			System.out.println("After");
		}
		System.out.println(invoiceDate.toString());
		long daysleft = shoppingDate.until(invoiceDate, ChronoUnit.DAYS);
		System.out.println(daysleft);
	}
}