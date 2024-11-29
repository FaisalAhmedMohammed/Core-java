package com.ashokit.core;

public class IndexOf {
	public static void main(String[] args) {
		String str = "faisal ahmed";
		int x = Index(str);
		System.out.println(x);
	}

	private static int Index(String str) {
		return str.indexOf('a',5);
	}

}
