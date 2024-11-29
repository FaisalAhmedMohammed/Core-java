package com.ashokit.oop;

public class Concat_returnit {
	public static void main(String[] args) {
		String fname = "ashok";
		String lname = "it";
		String show = Concat(fname, lname);
		System.out.println("concat of two string is :" + show);
	}

	private static String Concat(String fname, String lname) {
		return fname + lname;
	}

}
