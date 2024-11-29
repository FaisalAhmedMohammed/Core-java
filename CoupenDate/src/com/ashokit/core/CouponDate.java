package com.ashokit.core;

import java.time.LocalDate;
/*
 * This program accepts coupon date, start date and end date as input
 * If coupon date is between start and end dates then it is valid coupon
 * If coupon date is before start date then it can be used in future
 * If coupon date is after end date then it is expired coupon
 */
import java.util.Scanner;

public class CouponDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coupen date(yyyy-mm-dd)");
		String str1 = sc.nextLine();
		/*
		 * i cannot take directly date as input as data I can take input as string then
		 * I should convert it into integer This statement converts a string into date
		 */
		LocalDate coupenDate = LocalDate.parse(str1);

		System.out.println("Enter start date (yyyy--mm--dd)");
		String str2 = sc.nextLine();
		// we have to convert string in to integer using LocalDate class
		LocalDate startDate = LocalDate.parse(str2);

		System.out.println("Enter End date (yyyy-mm-dd)");
		String str3 = sc.nextLine();
		// convert string into localDate using LocalDate classs
		LocalDate endDate = LocalDate.parse(str3);

		if (coupenDate.isAfter(startDate) && (coupenDate.isBefore(endDate))) {
			System.out.println("it is valid coupen");
		} else if (coupenDate.equals(startDate) && coupenDate.equals(endDate)) {
			System.out.println("it is valid date");

		} else if (coupenDate.isBefore(startDate)) {
			System.out.println("it can be used in future");
		} else {
			System.out.println("coupen is expired");
		}

	}

}
