package com.ashokit.core;

public class Palindrome_approach_3 {
	public static void main(String[] args) {
		String str = "madam";
		boolean s = palind(str);
		if (s == true) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	private static boolean palind(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
