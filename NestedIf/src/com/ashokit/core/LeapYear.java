package com.ashokit.core;

import java.util.Scanner;

/*
 * This program checks whether a given year is a leap year or not
 * 1. if a year is not divisible by 4, it is not a leap year
 * 2. if a year is divisible by 4 and not divisible by 100, it is a leap year
 * 3. if a year is divisible by 4 and 100 then it must be divisible by 400, it is a leap year
 * 4. otherwise, not a leap year 
 * 
 */

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("It is Leap Yeay");
				} else {
					System.out.println("Not a Leap Year");
				}

			} else {
				System.out.println("It is a Leap Year");
			}
		} else {
			System.out.println("It is not a Leap Year");
		}

	}

}
