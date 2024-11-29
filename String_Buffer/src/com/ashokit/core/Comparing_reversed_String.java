package com.ashokit.core;

public class Comparing_reversed_String {
	public static void main(String[] args) {
		String str = "hello";
		String reverdedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(reverdedString += str.charAt(i));
		}
	}

}
