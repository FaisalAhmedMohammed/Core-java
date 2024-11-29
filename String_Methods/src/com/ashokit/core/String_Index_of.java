package com.ashokit.core;

public class String_Index_of {
	public static void main(String[] args) {
		String str = "hello hi hello hi";
		int d = find(str);
		System.out.println(d);
	}

	private static int find(String str) {
		return str.indexOf("hi");
	}

}
