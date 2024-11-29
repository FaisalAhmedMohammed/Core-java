package com.ashokit.core;

public class Switch_03 {
	public static void main(String[] args) {
		String day = "friday";
		switch (day) {
		case "monday":
			System.out.println("monday is lazy day");
			break;
		case "Tuesday":
		case "wednesday":
		case "thursday":
			System.out.println("it i horrable day!!");
			break;
		case "friday":
			System.out.println("friday is so so||");
			break;
		case "saturday":
		case "sunday":
			System.out.println("it is holiday");
			break;

		}
	}

}
