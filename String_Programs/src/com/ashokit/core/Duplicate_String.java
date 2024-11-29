package com.ashokit.core;

public class Duplicate_String {
	public static void main(String[] args) {
		String name = "missisipi";
		duplicate(name);
	}

	private static void duplicate(String name) {
		String st = "";// misp
		for (int i = 0; i < name.length(); i++) {
			if (!st.contains(name.charAt(i) + "")) {
				st += name.charAt(i);
			}
		}

		System.out.println(st);
	}

}
