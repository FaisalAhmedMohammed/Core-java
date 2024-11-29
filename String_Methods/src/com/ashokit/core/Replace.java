package com.ashokit.core;

public class Replace {
	public static void main(String[] args) {
		String str = "faisal ahmed";
		String d = replac(str);
		System.out.println(d);
	}

	private static String replac(String str) {
		return str.replace('a', 'f');
	}

}
