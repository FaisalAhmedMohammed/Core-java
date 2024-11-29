package com.ashokit.core;

public class Replace_RegularExpression {
	public static void main(String[] args) {
		String name = "Core Java";
		String a = regular(name);
		System.out.println(a);
	}

	private static String regular(String name) {
		return name.replaceAll("[A-Za-z]","" );//op is empty
		//bcoz we are replacing [A-Za-z with empty
	}

}
