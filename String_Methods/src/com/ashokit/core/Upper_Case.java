package com.ashokit.core;

public class Upper_Case {
	public static void main(String[] args) {
		String name = "faisal";
		String upper = Uppercase(name);
		System.out.println(upper);
	}

	private static String Uppercase(String name) {
		return name.toUpperCase();
	}

}
