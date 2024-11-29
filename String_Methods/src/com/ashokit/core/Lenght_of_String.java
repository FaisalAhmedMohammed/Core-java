package com.ashokit.core;

public class Lenght_of_String {
	public static void main(String[] args) {
		String name = "faisal";
		int x = findLength(name);
		System.out.println(x);

	}

	private static int findLength(String name) {
		return name.length();
	}

}
