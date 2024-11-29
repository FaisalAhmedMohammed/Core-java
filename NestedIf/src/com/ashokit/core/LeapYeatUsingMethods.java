package com.ashokit.core;

//this program check whether the given year is leap year or not using methods 
import java.util.Scanner;

public class LeapYeatUsingMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();

		LYear(year);
	}

	private static void LYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap year");
				} else {
					System.out.println("not a leap year");
				}
			} else {
				System.out.println("it is leap year");
			}
		} else {
			System.out.println("not a leap year");
		}

	}

}
