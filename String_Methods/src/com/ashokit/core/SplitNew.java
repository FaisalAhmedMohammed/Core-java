package com.ashokit.core;

public class SplitNew {
	public static void main(String[] args) {
		String str = "spring is a frame work";
		String[] s = split(str);
		for (String a : s)
			System.out.println(a);
	}

	private static String[] split(String str) {
		return str.split("i");
	}

}
