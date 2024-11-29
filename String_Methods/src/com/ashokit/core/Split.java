package com.ashokit.core;

public class Split {
	public static void main(String[] args) {
		String name = "java is a technology";
		String[] sname = split(name);
		for (String d : sname) {
			System.out.println(d);
		}
	}

	private static String[] split(String name) {
		return name.split(" ");
	}
}
