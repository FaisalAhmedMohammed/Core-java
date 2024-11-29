package com.ashokit.core;

/*this method is used to convert any primitive type into a string
 * valueOf is a static method that should be called using class name(String)*/
public class ValueOf {
	public static void main(String[] args) {
		int a = 123;
		int b = 456;
		boolean d = true;
		boolean f = false;
		String ss = m1(true, false);
		System.out.println(ss);
		String s = show(a, b);
		System.out.println(s);
	}

	private static String show(int a, int b) {
		return String.valueOf(a) + String.valueOf(b);

	}

	private static String m1(boolean d, boolean f) {
		return String.valueOf(d) + String.valueOf(f);
	}

}
