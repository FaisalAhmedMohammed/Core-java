package com.ashokit.core;

import java.util.Arrays;

public class Simple {
	public static void main(String[] args) {
		Simple ss = new Simple();

		int length = ss.Findlen("ashok");
		System.out.println(length);

		int ad = ss.add(10, 1);
		System.out.println(ad);

		String name = ss.concat("faisal", "ahmed");
		System.out.println(name);

		boolean agge = ss.eligable(18);
		System.out.println(agge);

		String str = ss.upper("ashok");
		System.out.println(str);

	}

	public int Findlen(String fname) {
		return fname.length();
	}

	int add(int a, int b) {
		return a + b;
	}

	String concat(String fullname, String lname) {
		return fullname + lname;
	}

	boolean eligable(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}

	}

	String upper(String names) {
		return names.toUpperCase();
	}

}
