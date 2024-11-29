package com.ashokit.core;

public class Remove_Special {
	public static void main(String[] args) {
		String name = "j#a$v@a%";
		String s = remove(name);
		System.out.println(s);
	}

	private static String remove(String name) {
		return name.replaceAll("[^A-Za-z0-9]", "");
	}

}
