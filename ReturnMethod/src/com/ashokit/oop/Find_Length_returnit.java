package com.ashokit.oop;

public class Find_Length_returnit {
	public static void main(String[] args) {
		String name = "ashokit";
		int length = Findlength(name);
		System.out.println("Length of name is :" + length);
	}

	private static int Findlength(String name) {
		return name.length();
	}

}
