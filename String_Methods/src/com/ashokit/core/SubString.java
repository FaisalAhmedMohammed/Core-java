package com.ashokit.core;

public class SubString {
	public static void main(String[] args) {
		String name = "java is a technology";
		String x = sub(name);
		System.out.println(x);
	}

	private static String sub(String name) {
		return name.substring(0,3);//this will return a string from start index to end-1 index.
	}

}
