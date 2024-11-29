package com.ashokit.core;

public class Join_Strings {
	public static void main(String[] args) {
		String[] name = { "faisal", "ahmed", "anas", "jani" };
		String st = findjoin(name);
		System.out.println(st);
	}

	private static String findjoin(String[] name) {
		return String.join("-", name);

	}

}
