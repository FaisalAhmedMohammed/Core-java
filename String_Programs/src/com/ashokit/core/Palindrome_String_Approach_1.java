package com.ashokit.core;

public class Palindrome_String_Approach_1 {
	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		String s = palindrome(str, reverse);
		System.out.println(s);

	}

	private static String palindrome(String str, String reverse) {
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

}
