package com.ashokit.core;

public class Palindrome_Approach_2 {
	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		String ss = palind(str, reverse);
		System.out.println(ss);
	}

	private static String palind(String str, String reverse) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse += ch[i];
		}
		return reverse;

	}

}
