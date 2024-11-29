package com.ashokit.core;

public class Reverse_String {
	public static void main(String[] args) {
		String name = "Hello";
		String reverse = reverse(name);
		System.out.println(reverse);

	}

	private static String reverse(String name) {
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}
		return rev;

	}
}
