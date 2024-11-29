package com.ashokit.core;

/*this method is used to check whether the given string is empty or not*/
public class IsEmpty {
	public static void main(String[] args) {
		String str = " ";
		boolean ss = check(str);
		System.out.println(ss);
	}

	private static boolean check(String s) {
		return s.trim().isEmpty();
	}

}
