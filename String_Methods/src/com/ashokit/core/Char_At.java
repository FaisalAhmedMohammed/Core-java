package com.ashokit.core;

public class Char_At {
	public static void main(String[] args) {
		String str = "core java";
		char c = ch(str);
		System.out.println("character at given index is:" + c);
	}

	private static char ch(String str) {
		return str.charAt(8);
	}

}
