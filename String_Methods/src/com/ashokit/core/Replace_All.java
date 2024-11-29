package com.ashokit.core;

public class Replace_All {
	public static void main(String[] args) {
		String str = "java is a programming language";
		String ss = replace(str);
		System.out.println(ss);
	}

	private static String replace(String str) {
		return str.replaceAll("java is a programming language", "spring is a framework");
	}

}
