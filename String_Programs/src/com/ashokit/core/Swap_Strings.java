package com.ashokit.core;

public class Swap_Strings {
	public static void main(String[] args) {
		String st1 = "faisal";
		String st2 = "ahmed";
		swap(st1, st2);
	}

	private static void swap(String st1, String st2) {
		st1 = st1 + st2;
		st2 = st1.substring(0, st1.length() - st2.length());
		st1 = st1.substring(st2.length());
		System.out.println("sting 1: " + st1);
		System.out.println("sting 2: " + st2);

	}

}
