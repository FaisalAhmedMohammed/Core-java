package com.ashokit.core;

public class Replace_String {
	public static void main(String[] args) {
		String str = "java is a language";
		String st = findx(str);
		System.out.println(st);
	}

	private static String findx(String str) {
		return str.replace("java", "python");
	}

}
